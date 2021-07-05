package code._4_student_effort._6_challengeSix;

public class Person {

    private String name;
    private String job;
    private String university;
    private Boolean drivingLicense;
    private Boolean isMarried;

    public Person(String name) {
        this.name = name;
    }

    public Person (PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.job = personBuilder.job;
        this.university = personBuilder.university;
        this.drivingLicense = personBuilder.drivingLicense;
        this.isMarried = personBuilder.isMarried;
    }

    public static class PersonBuilder {
        private final String name;
        private String job;
        private String university;
        private Boolean drivingLicense;
        private Boolean isMarried;

        public PersonBuilder (String name) {
            this.name = name;
        }

        public PersonBuilder job (String job) {
            this.job = job;
            return this;
        }

        public PersonBuilder university (String university) {
            this.university = university;
            return this;
        }

         public PersonBuilder drivingLicense (Boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
         }

         public PersonBuilder isMarried (Boolean isMarried) {
            this.isMarried = isMarried;
            return this;
         }

         public Person build() {
            return new Person(this);
         }
    }
}
