package code._4_student_effort;

public class Person {
    String name;
    String job;
    String university;
    String drivingLicense;
    boolean isMarried;

    class Builder {
        private final String name;
        private String job;
        private String university;
        private String drivingLicense;
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

        public Builder drivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = this.name;
            person.job = this.job;
            person.university = this.university;
            person.drivingLicense = this.drivingLicense;
            person.isMarried = this.isMarried;
            return person;
        }


    }
    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
