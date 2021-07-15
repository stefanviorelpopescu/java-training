package code._4_student_effort.Challange3;

public class Cat extends Animal implements Pet{
    public String name;

    protected Cat(String name)
    {
        super(4);
        this.name = name;
    }
    protected Cat()
    {
        this("");
    }
    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }
    @Override
    public void eat()
    {
        System.out.println("Pisica " + name + " mananca conserve de carne");
    }
    @Override
    public void play()
    {
        System.out.println("Pisica " + name + " se joaca cu un soricel");
    }

}