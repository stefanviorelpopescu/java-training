package code._4_student_effort;

import code._4_student_effort.Challenge6.Person;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

    Person person=new Person.Builder("Bogdan")
            .setJob("Yes")
            .setMarried(false)
            .setDrivingLicense(true)
            .build();
  }
}
