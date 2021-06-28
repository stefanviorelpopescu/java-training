package code._4_student_effort;

import code._4_student_effort.Strategy;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    //Challange 1
    /*
    int[] arr = new int[]{1,2,3};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);
    while (it.hasNext()){
      System.out.println(it.next());
    }*/


//Chalange 3

   /* Apartement app1 = new Apartement("Crangasi01", 300);
    Apartement app2 = new Apartement("Crangasi01", 600);
    Apartement app3 = new Apartement("Crangasi01", 350);
    Apartement app4 = new Apartement("Crangasi01", 400);
    Apartement app5 = new Apartement("Crangasi01", 200);

    RealEstateAgent proxy = new RealEstateAgent();
    proxy.represent(app1);
    proxy.represent(app2);
    proxy.represent(app3);
    proxy.represent(app4);
    proxy.represent(app5);

    Student student01 = new Student("Ionescu", 500);
    Student student02 = new Student("Popescu", 330);

    Apartement apartementForStudent01 = proxy.rent(student01);
    System.out.println(student01 + "rented" + apartementForStudent01);

    Apartement apartementForStudent02 = proxy.rent(student02);
    System.out.println(student02 + "rented" + apartementForStudent02);
  }*/

    //Challange 4

   /* Teacher teacher = new Teacher();
    StudentChallange4 s01 = new StudentChallange4("Popescu ");
    StudentChallange4 s02 = new StudentChallange4("Ionescu ");
    StudentChallange4 s03 = new StudentChallange4("Dragomirescu ");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[]{
    " Basics",
            " Oo",
            " Design patterns"
  };

    for (int i=0; i < javaTopics.length; i++){
      teacher.teach(javaTopics[i]);
    }*/

    Person person = new Person.Builder("Stratulat")
            .job("Student")
            .university("UPB")
            .drivingLicense(true)
            .isMarried(false)
            .build();
  }
}

