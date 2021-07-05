package code._4_student_effort._3_challengeThree;

public class Spider extends Animal {

    protected Spider () {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider is eating now.");
    }

    public void eat(int pieces, String food) {
        System.out.println("The spider is eating " + pieces + " " + food + " daily.");
    }
}
