package ip;

public class Horse extends Animals{
    private String name;
    private String environment;

    public Horse(String name, String environment)
    {
        this.name = name;
        this.environment = environment;
    }

    @Override
    public void name() {
        System.out.println(this.name);
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
}
