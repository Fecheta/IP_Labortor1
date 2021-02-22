package ip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


////// Dinco Ionut si Fecheta Virgil -grupa B2


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter("filename.txt");
        writer.print("");
        writer.close();



        Horse h = new Horse("Bob", "terrestrial");
        Horse h1 = new Horse("Bob1", "terrestrial");
        Horse h2 = new Horse("Bob2", "terrestrial");

        Lion l1 = new Lion("L1","terrestrial");
        Lion l2 = new Lion("L2","terrestrial");
        Lion l3 = new Lion("L3","terrestrial");

        Parrot p1 = new Parrot("P1", "air");
        Parrot p2 = new Parrot("P2", "air");
        Parrot p3 = new Parrot("P3", "air");

        Owl o1 = new Owl("O1", "air");
        Owl o2 = new Owl("O2", "air");
        Owl o3 = new Owl("O3", "air");

        Shark s1 = new Shark("S1", "aqua");
        Shark s2 = new Shark("S2", "aqua");
        Shark s3 = new Shark("S3", "aqua");

        TropicalFish tf1 = new TropicalFish("TF1", "aqua");
        TropicalFish tf2 = new TropicalFish("TF2", "aqua");
        TropicalFish tf3 = new TropicalFish("TF3", "aqua");

        Animal_Pen Pa = new Animal_Pen();
        Aquarium Aq = new Aquarium();
        Air Ar = new Air();

        Pa.addAnimal(h);
        Pa.addAnimal(h1);
        Pa.addAnimal(h1);
        Pa.addAnimal(l1);
        Pa.addAnimal(l2);
        Pa.addAnimal(l3);
        Pa.Print();

        Ar.addAnimal(p1);
        Ar.addAnimal(p2);
        Ar.addAnimal(p3);
        Ar.addAnimal(o1);
        Ar.addAnimal(o2);
        Ar.addAnimal(o3);
        Ar.Print();

        Aq.addAnimal(s1);
        Aq.addAnimal(s2);
        Aq.addAnimal(s3);
        Aq.addAnimal(tf1);
        Aq.addAnimal(tf2);
        Aq.addAnimal(tf3);
        Aq.Print();

        Pa.deleteAnimal(h1);
        Pa.deleteAnimal(l2);

        Ar.deleteAnimal(p2);
        Ar.deleteAnimal(o2);

        Aq.deleteAnimal(s2);
        Aq.deleteAnimal(tf2);

        Pa.Print();
        Ar.Print();
        Aq.Print();
        p1.eat();
        p1.move();
        p1.sound();
        s1.color();
        s1.eat();
        s1.move();
        h1.color();
        h1.sound();
        h1.move();
        o2.sound();
        o2.move();
        o2.eat();
        tf2.eat();
        tf2.sound();
        tf1.move();
    }
}
