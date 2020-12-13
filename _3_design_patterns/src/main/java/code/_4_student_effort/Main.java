package code._4_student_effort;

import code._4_student_effort.CodeChallenge3.Apartament;
import code._4_student_effort.CodeChallenge3.RealEstateAgentProxy;
import code._4_student_effort.CodeChallenge3.Student;
import code._4_student_effort.CodeChallenge4.Students;
import code._4_student_effort.CodeChallenge4.Teacher;
import code._4_student_effort.CodeChallenge6.Person;

import java.util.Arrays;

public class Main {
  public static void displaySorted(Integer[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void codeChallenge3(){
    Apartament app01=new Apartament("Crangasi01",300);
    Apartament app02=new Apartament("Crangasi01",600);
    Apartament app03=new Apartament("Crangasi01",350);
    Apartament app04=new Apartament("Crangasi01",400);
    Apartament app05=new Apartament("Crangasi01",200);

    RealEstateAgentProxy proxy=new RealEstateAgentProxy();
    proxy.represent(app01);
    proxy.represent(app02);
    proxy.represent(app03);
    proxy.represent(app04);
    proxy.represent(app05);

    Student student01=new Student("Ionescu",500);
    Student student02=new Student("Popescu",330);

    Apartament apartamentForStudent01=proxy.rent(student01);
    System.out.println(student01+" rented "+apartamentForStudent01);
    Apartament apartamentForStudent02=proxy.rent(student02);
    System.out.println(student02+ " rented "+apartamentForStudent02);
  }

  public static void codeChallenge4(){
    Teacher teacher=new Teacher();
  Students s01=new Students("Popescu");
  Students s02=new Students("Ionescu");
  Students s03=new Students("Dragomirescu");

  s01.listenTo(teacher);
  s02.listenTo(teacher);
  s03.listenTo(teacher);

  String[] javaTopics=new String[]{
          "basic",
          "oo",
          "design patterns"
  };
  for(int i=0;i<javaTopics.length;i++){
    teacher.teach(javaTopics[i]);
  }

  }

  public static void codeChallenge5(){
    Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    AscBubbleSort asc = new AscBubbleSort();
    asc.sort(copy01OfArr);
    DescBubbleSort desc = new DescBubbleSort();
    desc.sort(copy02OfArr);

    displaySorted(copy01OfArr);
    displaySorted(copy02OfArr);

  }

  public static void codeChallenge6(){
    Person person=new Person.Builder("John").build();
    Person p1=new Person.Builder("Ion").setDrivingLicence(true).build();
    Person p2=new Person.Builder("Ana").setJob("Lawyer").setMarried(false).build();
  }

  public static void main(String[] args) {
    System.out.println("----- CODE CHALLENGE 3 -----");
    codeChallenge3();
    System.out.println("----- CODE CHALLENGE 4 -----");
    codeChallenge4();
    System.out.println("----- CODE CHALLENGE 5 -----");
    codeChallenge5();
    System.out.println("----- CODE CHALLENGE 6 -----");
    codeChallenge6();
  }
}
