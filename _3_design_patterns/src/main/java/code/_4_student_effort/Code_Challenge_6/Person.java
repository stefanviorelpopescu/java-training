package code._4_student_effort.Code_Challenge_6;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;


    public Person(PersonBuilder personBuilder) {
        this.name = personBuilder.getName();
        this.job = personBuilder.getJob();
        this.university = personBuilder.getUniversity();
        this.drivingLicense = personBuilder.getDrivingLicense();
        this.isMarried = personBuilder.isMarried();
    }
}
