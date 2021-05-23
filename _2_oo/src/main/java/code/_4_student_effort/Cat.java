package code._4_student_effort;

public class Cat extends Animal implements Pet{
    public String petName;
    public Cat(String petName) {
        super(4);
        this.petName = petName;

    }

        //constructor without paramters
        public Cat(){
            this(" ");
        }
    //implementation of the Pet interface methods
    public String getName() {

        return this.petName;
    }

    public void setName(String petName) {

        this.petName=petName;
    }

    public void play() {

        System.out.println("Cat named " + petName + " is playing");
    }

    //implementation of the eat() method
    public void eat() {

        System.out.println("Cat named " + petName + " is eating");
    }

}
