package code._4_student_effort.DPproject2;

public class shortCoffe extends coffeDecorator {


    public shortCoffe(Coffe coffe) {
        super(coffe);
    }

    public String makeCoffe() {
        return coffe.makeCoffe() + someMilk();
    }

    public String someMilk() {
        return " 30 ml of milk added";
    }
}
