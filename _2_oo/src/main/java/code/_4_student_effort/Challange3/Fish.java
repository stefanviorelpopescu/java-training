package code._4_student_effort.Challange3;

public class Fish extends Animal implements Pet{
    public String name;

    public Fish()
    {
        super(0);
    };

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
    public void play()
    {
        System.out.println("Pestele " + name + " se joaca");
    }

    @Override
    public void walk()
    {
        System.out.println("Pestii nu pot merge si nu au picioare");
    }

    @Override
    public void eat()
    {
        System.out.println("Pestele " + name + " mananca alt pesti mai mici");
    }

}

