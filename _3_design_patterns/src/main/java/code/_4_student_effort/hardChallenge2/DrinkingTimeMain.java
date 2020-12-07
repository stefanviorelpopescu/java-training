package code._4_student_effort.hardChallenge2;

public class DrinkingTimeMain {
    public static void main(String[] args) {
        IPerson person = new Person.Builder().setName("Duke").build();
        person.walk();
        person.drink();
    }
}
