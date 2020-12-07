package code._4_student_effort.challenge6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Iulia")
                .setUniversity("Politehnica")
                .build();
        Person person2 = new Person.Builder("Ion")
                .SetIsMarried(true)
                .setJob("Somer")
                .build();

        System.out.println(person1.getName() + " " + person1.getUniversity());
        System.out.println(person2.getName() + " " + person2.isMarried() + " " + person2.getJob());
    }
}
