package code._4_student_effort.Challange6;

public class Main {
    public static void main(String[] args)
    {
        Person person01 = new Person.Builder("Balescu")
                .job("student")
                .university("UTCN")
                .isMarried(false)
                .build();

        Person person02 = new Person.Builder("Gherman")
                .drivingLicense("B")
                .isMarried(true)
                .build();

        System.out.println("Person1: ");
        System.out.println(person01);
        System.out.println("Person2: ");
        System.out.println(person02);


    }
}
