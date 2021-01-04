package code._4_student_effort.DPproject2;

public class caffeLatte extends coffeDecorator {


    public caffeLatte(Coffe coffe) {
        super(coffe);
    }

    public String makeCoffe() {
        return coffe.makeCoffe() + milkFoam();
    }

    private String milkFoam() {
        return " Milk Foam Added";
    }
}
