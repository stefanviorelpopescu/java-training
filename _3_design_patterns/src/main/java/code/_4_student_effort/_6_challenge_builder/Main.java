package code._4_student_effort._6_challenge_builder;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CodeChallenge6(){
        Person person = new Person.Builder("George")
                                            .withDrivingLicense(true)
                                            .withJob("Carpenter")
                                            .withMarried(false)
                                            .withUniversity("UTC-N")
                                            .build();

        Person person1 = new Person.Builder("Bob").build();

        Person person2 = new Person.Builder("Ricky")
                                            .withMarried(true)
                                            .withJob("Builder")
                                            .withUniversity("UBB")
                                            .build();

        System.out.println(person);
        System.out.println(person1);
        System.out.println(person2);
    }

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 6 ----" + ANSI_RESET);
        CodeChallenge6();
    }
}
