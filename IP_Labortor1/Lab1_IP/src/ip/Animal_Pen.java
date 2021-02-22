package ip;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Animal_Pen {

    private static ArrayList<Animals> ground_zoo = new ArrayList<>();

    public void addAnimal(Animals a)
    {
        if(a.environment() == "terrestrial")
            this.ground_zoo.add(a);
        else
            System.out.printf("Animalul %s nu este terestru", a.name());
    }

    public void deleteAnimal(Animals a)
    {
        this.ground_zoo.remove(a);
    }

    public void Print()
    {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        String s;
        try {
            for(Animals i : ground_zoo) {
                s = i.name() + " is " + i.getTip() + "\n";
                Files.write(Paths.get("filename.txt"), s.getBytes(), StandardOpenOption.APPEND);
            }
        }catch (IOException e) {
            System.out.println("error");
        }
    }
}
