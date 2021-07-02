package code._4_student_effort.challenge3;

public class Fish extends Animal implements Pet {

    private String name;

    protected Fish() {
        super(0);
        this.name = "fishy";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish do be playing");
    }

    @Override
    protected void eat() {
        System.out.println("Fish do be eating");
    }

    @Override
    protected void walk() {
        System.out.println("Fish do not walk");
    }


}
