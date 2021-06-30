package code._4_student_effort.builder;

public class Person {
    private String name; // required parameter

    // optional parameters
    private String job;
    private String university;
    private boolean hasDrivingLicense;
    private boolean isMarried;

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.hasDrivingLicense = builder.hasDrivingLicense;
        this.isMarried = builder.isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", hasDrivingLicense=" + hasDrivingLicense +
                ", isMarried=" + isMarried +
                '}';
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private boolean hasDrivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withJob(String job) {
            this.job = job;
            return this;
        }

        public Builder withUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder withDrivingLicense(boolean hasDrivingLicense) {
            this.hasDrivingLicense = hasDrivingLicense;
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
}
