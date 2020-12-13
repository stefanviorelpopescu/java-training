package code._4_student_effort._6_challenge;

public class Main {

    public static void CodeChallenge6(){
        Person person = new Person.Builder("David")
                .withDrivingLicense(true)
                .withJob("Game Dev")
                .withMarried(false)
                .withUniversity("UniBuc")
                .build();

        Person person1 = new Person.Builder("Antonio").build();

        Person person2 = new Person.Builder("Albert")
                .withMarried(true)
                .withJob("Data Scientist")
                .withUniversity("UPB")
                .build();

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }

    public static void main(String[] args) {
        CodeChallenge6();
    }
}
