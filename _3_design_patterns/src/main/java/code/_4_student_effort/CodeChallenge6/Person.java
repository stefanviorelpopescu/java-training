package code._4_student_effort.CodeChallenge6;

public class Person {
    public String name;
    public String job;
    public String university;
    public boolean drivingLicence;
    public boolean isMarried;

    private Person(Builder builder){
        this.name=builder.name;
        this.job=builder.job;
        this.university=builder.university;
        this.drivingLicence=builder.drivingLicence;
        this.isMarried=builder.isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public boolean isDrivingLicence() {
        return drivingLicence;
    }

    public boolean isMarried() {
        return isMarried;
    }

   public static class Builder{
        public String name;
        public String job;
        public String university;
        public boolean drivingLicence;
        public boolean isMarried;

        public Builder(String name){
            this.name=name;
        }

       public Builder setJob(String job) {
           this.job = job;
           return this;
       }

       public Builder setUniversity(String university) {
           this.university = university;
           return this;
       }

       public Builder setDrivingLicence(boolean drivingLicence) {
           this.drivingLicence = drivingLicence;
           return this;
       }

       public Builder setMarried(boolean married) {
           isMarried = married;
           return this;
       }
       public Person build(){
            return new Person(this);
       }
   }
}
