package ip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Aquarium {

    private static ArrayList<Animals> aqua_zoo = new ArrayList<>();

    public void addAnimal(Animals a)
    {
        if(a.environment() == "aqua")
            this.aqua_zoo.add(a);
        else
            System.out.printf("Animalul %s nu este acvatic", a.name());
    }

    public void deleteAnimal(Animals a)
    {
        this.aqua_zoo.remove(a);
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
            for(Animals i : aqua_zoo) {
                s = i.name() + " is " + i.getTip() + "\n";
                Files.write(Paths.get("filename.txt"), s.getBytes(), StandardOpenOption.APPEND);
            }
        }catch (IOException e) {
            System.out.println("error");
        }
    }
}
