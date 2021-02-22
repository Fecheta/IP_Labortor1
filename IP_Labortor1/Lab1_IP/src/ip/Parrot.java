package ip;

import java.io.FileWriter;
import java.io.IOException;

public class Parrot extends Animals{
    private String name;
    private String environment;
    private String tip;

    public Parrot(String name, String environment)
    {
        this.name = name;
        this.environment = environment;
        this.tip = "parrot";
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void eat() {
        try
        {
            String message =  this.name() + " eats seeds.\n";
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(message);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    @Override
    public void sound() {
        try
        {
            String message = "the sound made by " + this.name() + " : can repeat some words after you\n";
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(message);//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    @Override
    public void move() {
            try
            {
                String message =  this.name() + " flys\n";
                String filename = "filename.txt";
                FileWriter fw = new FileWriter(filename,true); //the true will append the new data
                fw.write(message);//appends the string to the file
                fw.close();
            }
            catch(IOException ioe)
            {
                System.err.println("IOException: " + ioe.getMessage());
            }
    }

    @Override
    public void color() {
                try
                {
                    String message =  this.name()  + " may have several color combinations \n";
                    String filename = "filename.txt";
                    FileWriter fw = new FileWriter(filename,true); //the true will append the new data
                    fw.write(message);//appends the string to the file
                    fw.close();
                }
                catch(IOException ioe)
                {
                    System.err.println("IOException: " + ioe.getMessage());
                }
    }

    @Override
    public String environment() {
        return this.environment;
    }

    public String getTip()
    {
        return this.tip;
    }
}
