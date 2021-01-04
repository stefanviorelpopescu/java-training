package code._4_student_effort.DPproject2;

public class longCoffe extends coffeDecorator{
    public longCoffe(Coffe coffe) {
        super(coffe);
    }
    public String makeCoffe() {
        return coffe.makeCoffe() + moreMilk();
    }
    public String moreMilk() {
        return " 60 ml of milk addded";
    }
}




