package code._4_student_effort.animal;

public abstract class Animal {

    Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        if(legs == 0) {
            System.out.println("Animal is swimming " + legs);
        }
        else {
            System.out.println("Animal is wlaking " + legs);
        }
    }
}
