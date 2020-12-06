package code._4_student_effort;

public class Student {
    private String name;
    private String job;
    private String university;
    private boolean driverLicese;
    private boolean isMarried;

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public boolean isDriverLicese() {
        return driverLicese;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String getName() {
        return name;
    }
    private Student(Builder builder){
        name=builder.name;
        job=builder.job;
        university=builder.university;
        driverLicese=builder.driverLicese;
        isMarried=builder.isMarried;
    }
    public static class Builder {
        private String name;
        private String job;
        private String university;
        private boolean driverLicese;
        private boolean isMarried;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;

        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDriverLicese(boolean driverLicese) {
            this.driverLicese = driverLicese;
            return this;
        }

        public Builder setMarried(boolean married) {
            isMarried = married;
            return this;
        }

        public Builder(String name){
            this.name=name;
        }

        public Student build(){
            return new Student(this);
        }

    }
}
