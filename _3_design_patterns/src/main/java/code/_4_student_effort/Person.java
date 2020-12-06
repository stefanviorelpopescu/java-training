package code._4_student_effort;

public class Person {
    String name;
    String job;
    String university;
    boolean drivingLicense;
    boolean isMarried;

    public Person(String name, String job, String university, boolean drivingLicense, boolean isMarried) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
        this.isMarried = isMarried;
    }

    public Person(Person.Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public static class Builder {
        private final String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder drivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "job='" + job + '\'' +
                "university='" + university + '\'' +
                "drivingLicense='" + drivingLicense + '\'' +
                "isMarried='" + isMarried +
                '}';
    }
}
