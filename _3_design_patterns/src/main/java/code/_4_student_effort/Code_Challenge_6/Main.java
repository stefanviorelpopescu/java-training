package code._4_student_effort.Code_Challenge_6;


public class Main {
    public static void main(String[] args){

        Person person01 = new PersonBuilder("Popescu")
                .withJob("java developer")
                .withUniversity("FMI")
                .withMarried(false)
                .build();

        Person person02 = new PersonBuilder("Ionescu")
                .withDrivingLicense("B")
                .withMarried(true)
                .build();
    }
}
