package ip;

import java.io.FileWriter;
import java.io.IOException;

public class Owl extends Animals{
    private String name;
    private String environment;
    private String tip;

    public Owl(String name, String environment)
    {
        this.name = name;
        this.environment = environment;
        this.tip = "owl";
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
        try {
            String message = "the sound of " + this.name() + " :buhuhuuuuu \n";
            String filename = "filename.txt";
            FileWriter fw = new FileWriter(filename, true); //the true will append the new data
            fw.write(message);//appends the string to the file
            fw.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
    @Override
    public void move() {
            try
            {
                String message =  this.name() + " flys \n";
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
                try {
                    String message = this.name() + " may have several color combinations \n";
                    String filename = "filename.txt";
                    FileWriter fw = new FileWriter(filename, true); //the true will append the new data
                    fw.write(message);//appends the string to the file
                    fw.close();
                } catch (IOException ioe) {
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
