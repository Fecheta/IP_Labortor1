package ip;

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
        System.out.println("");
    }

    @Override
    public void sound() {
        System.out.println("");
    }

    @Override
    public void move() {
        System.out.println("");
    }

    @Override
    public void color() {
        System.out.println("");
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