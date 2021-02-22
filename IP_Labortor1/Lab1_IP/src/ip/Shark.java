package ip;

import java.io.FileWriter;
import java.io.IOException;

public class Shark extends Animals{
    private String name;
    private String environment;
    private String tip;

    public Shark(String name, String environment)
    {
        this.name = name;
        this.environment = environment;
        this.tip = "shark";
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void eat() {
        try
        {
            String message =  this.name() + " eats meat \n";
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(message);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }           }

    @Override
    public void sound() {
        try
        {
            String message = "the soun of " + this.name() + " :hard to discribe \n";
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(message);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }           }

    @Override
    public void move() {
        try
        {
            String message =  this.name() + " swims \n";
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(message);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }           }

    @Override
    public void color() {
        try
        {
            String message =  this.name() + " : blue \n";
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(message);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }           }

    @Override
    public String environment() {
        return this.environment;
    }

    public String getTip()
    {
        return this.tip;
    }
}
