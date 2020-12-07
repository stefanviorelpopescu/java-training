package code._4_student_effort;

import code._2_challenge._5_template_method.AscBubleSort;
import code._2_challenge._5_template_method.DescBubleSort;
import code._2_challenge._6_builder.Person;
import code._2_challenge.hard._1_decorations.ChristmasTree;
import code._2_challenge.hard._1_decorations.DecorableTree;

import java.util.Arrays;

public class Main {
  static void CodeChallenge3(){
    Apartment app01 = new Apartment("Crangasi01", 300);
    Apartment app02 = new Apartment("Crangasi01", 600);
    Apartment app03 = new Apartment("Crangasi01", 350);
    Apartment app04 = new Apartment("Crangasi01", 400);
    Apartment app05 = new Apartment("Crangasi01", 200);

    RealEstateAgentProxy proxy = new RealEstateAgentProxy();
    proxy.represent(app01);
    proxy.represent(app02);
    proxy.represent(app03);
    proxy.represent(app04);
    proxy.represent(app05);

    StudentCC3 student01 = new StudentCC3("Ionescu", 500);
    StudentCC3 student02 = new StudentCC3("Popescu", 330);

    Apartment apartmentForStudent01 = proxy.rent(student01);
    System.out.println(student01 +" rented "+ apartmentForStudent01);
    Apartment apartmentForStudent02 = proxy.rent(student02);
    System.out.println(student02 +" rented "+ apartmentForStudent02);
  }

  static void CodeChallenge4(){
    Teacher teacher = new Teacher();

    StudentCC4 s01 = new StudentCC4("Popescu");
    StudentCC4 s02 = new StudentCC4("Ionescu");
    StudentCC4 s03 = new StudentCC4("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[]{
            "basics",
            "oo",
            "design patterns"
    };
    for(int i = 0; i < javaTopics.length; i++){
      teacher.teach(javaTopics[i]);
    }

  }
  static void CodeChallenge5(){
    Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    AscBubleSort asc = new AscBubleSort();
    asc.sort(copy01OfArr);

    DescBubleSort desc = new DescBubleSort();
    desc.sort(copy02OfArr);

    displaySorted(copy01OfArr);
    displaySorted(copy02OfArr);
  }
  public static void displaySorted(Integer []arr){
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i] + " ");
    }
    System.out.println();
  }

  static void CodeChallenge6(){
    code._2_challenge._6_builder.Person person01 = new Person.Builder("David")
            .job("Software Engineer")
            .university("ACS, UPB")
            .drivingLicense("B1")
            .isMarried(false)
            .build();
  }

  static void HardCodeChallenge1(){
    DecorableTree christmasTree = new ChristmasTree();
    //DecorableTree decoratedTree = new Garland(new Bulb(new Candy(christmasTree)));
    //decoratedTree.display();
    christmasTree.display();
  }
  static void HardCodeChallenge2(){
    
  }
  public static void main(String[] args) {
    //TODO put your code changes in here
    //CodeChallenge3();
    //CodeChallenge4();
    //CodeChallenge5();
    //CodeChallenge6();
    //HardCodeChallenge1();
    //HardCodeChallenge2();
  }
}
