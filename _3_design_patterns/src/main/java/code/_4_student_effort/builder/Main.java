package code._4_student_effort.builder;

public class Main {
    public static void main(String[] args) {
        Person john = new Person.Builder("John").withDrivingLicense(true).withJob("Lawyer").build();
        System.out.println(john);

        Person mary = new Person.Builder("Mary").withDrivingLicense(true).withJob("Doctor").withUniversity("Medical University").isMarried(true).build();
        System.out.println(mary);

        Person beth = new Person.Builder("Beth").withJob("Programmer").withUniversity("Technical University of Cluj-Napoca").withDrivingLicense(true).isMarried(false).build();
        System.out.println(beth);
    }
}
