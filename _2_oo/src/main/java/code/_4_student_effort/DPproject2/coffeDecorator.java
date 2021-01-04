package code._4_student_effort.DPproject2;

public class coffeDecorator implements Coffe{
    Coffe coffe;


    public coffeDecorator(Coffe coffe) {
        super();
        this.coffe = coffe;
    }

    public String makeCoffe() {
        return coffe.makeCoffe();
    }
}
