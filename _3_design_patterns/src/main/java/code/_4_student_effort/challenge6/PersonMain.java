package code._4_student_effort.challenge6;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person.Builder("Mereu").job("Student").university("UPB").drivingLicense("B").isMarried(false).build();

        System.out.println(person);
    }
}
