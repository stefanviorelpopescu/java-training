package code._4_student_effort;

public class Person {
    private final String name; //required
    private final String job; //optional
    private final String university; //optional
    private final String drivingLicese; //optional
    private final String isMarried; //optional

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicese = builder.drivingLicense;
        this.isMarried = builder.isMarried;
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

    public String getDrivingLicese() {
        return drivingLicese;
    }

    public String getIsMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicese='" + drivingLicese + '\'' +
                ", isMarried='" + isMarried + '\'' +
                '}';
    }

    public static class Builder {
        final String name; //required
        String job; //optional
        String university; //optional
        String drivingLicense; //optional
        String isMarried; //optional

        public Builder(String name){
            this.name=name;
        }

        public Builder job(String job){
            this.job=job;
            return this;
        }
        public Builder university(String university){
            this.university=university;
            return this;
        }
        public Builder drivingLicense(String drivingLicense){
            this.drivingLicense=drivingLicense;
            return this;
        }
        public Builder isMarried(String isMarried){
            this.isMarried=isMarried;
            return this;
        }

        public Person build(){
            Person person = new Person(this);
            return person;
        }
    }
}
