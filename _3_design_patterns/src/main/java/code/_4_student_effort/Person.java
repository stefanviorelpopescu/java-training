package code._4_student_effort;

public class Person {
   private String name,job,university,drivingLicense;
   private boolean isMaried;

   public Person(Builder builder)
   {this.name=builder.name;
   this.job=builder.job;
   this.university=builder.university;
   this.drivingLicense= builder.drivingLicense;
   this.isMaried= builder.isMaried;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense='" + drivingLicense + '\'' +
                ", isMaried=" + isMaried +
                '}';
    }

    public static class Builder
   {
       private final String name;
       private String job,university,drivingLicense;
       private boolean isMaried;

       public Builder(String name)
       {this.name=name;}

       public Builder job(String job)
       {
           this.job=job;
           return this;
       }
       public Builder university(String university)
       {
           this.university=university;
           return this;
       }
       public Builder drivingLicense(String drivingLicense)
       {
           this.drivingLicense=drivingLicense;
           return this;
       }
        public Builder isMaried(boolean isMaried)
        {
            this.isMaried=isMaried;
            return this;
        }
        public Person build()
        {
            return new Person(this);
        }
   }
}
