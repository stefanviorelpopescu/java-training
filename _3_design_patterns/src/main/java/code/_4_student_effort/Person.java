package code._4_student_effort;

public class Person {
    private String name;
    private String job;
    private String university;
    private String drivingLicese;
    private boolean isMaried;

    public Person (Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.drivingLicese = builder.drivingLicese;
        this.university = builder.university;
        this.isMaried = builder.isMaried;
    }
    static class Builder {
        private String name;
        private String job;
        private String university;
        private String drivingLicese;
        private boolean isMaried;

        public Builder (String name) {
            this.name = name;
        }

        public Builder married(boolean isMaried) {
            this.isMaried = isMaried;
            return this;
        }

        public Builder license(String drivingLicese) {
            this.drivingLicese = drivingLicese;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
