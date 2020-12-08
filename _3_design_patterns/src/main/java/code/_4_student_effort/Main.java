package code._4_student_effort;

import code._4_student_effort.CodeChallenge1.ArrayCustomIterator;
import code._4_student_effort.CodeChallenge2.BubbleSort;
import code._4_student_effort.CodeChallenge2.MergeSort;
import code._4_student_effort.CodeChallenge2.SortingStrategy;
import code._4_student_effort.CodeChallenge3.Apartment;
import code._4_student_effort.CodeChallenge3.RealEstateAgentProxy;
import code._4_student_effort.CodeChallenge3.Student;
import code._4_student_effort.CodeChallenge4.StudentObs;
import code._4_student_effort.CodeChallenge4.Teacher;
import code._4_student_effort.CodeChallenge5.AscBubbleSort;
import code._4_student_effort.CodeChallenge5.DescBubbleSort;
import code._4_student_effort.CodeChallenge6.Person;


import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

   codeChallenge1();
   System.out.println();

   codeChallenge2();
   System.out.println();

   codeChallenge3();
   System.out.println();

   codeChallenge4();
   System.out.println();

   codeChallenge5();
   System.out.println();

   codeChallenge6();
   System.out.println();

  }

  public static void codeChallenge1(){

    int[] arr = new int[] {1,2,3};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);

    while(it.hasNext()){
      System.out.println(it.next());
    }

  }

  public static void displaySorted(SortingStrategy strategy, Integer[] arr){

    strategy.sort(arr);
    System.out.println(Arrays.toString(arr));

  }

  public static void codeChallenge2(){

    Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy01ofArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02ofArr = Arrays.copyOf(arr, arr.length);

    displaySorted(new BubbleSort(), copy01ofArr);
    displaySorted(new MergeSort(), copy02ofArr);

  }

  public static void codeChallenge3() {

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

    Student student01 = new Student("Ionescu", 500);
    Student student02 = new Student("Popescu", 330);

    Apartment apartmentForStudent01 = proxy.rent(student01);
    System.out.println(student01 + " rented " + apartmentForStudent01);
    Apartment apartmentForStudent02 = proxy.rent(student02);
    System.out.println(student02 + " rented " + apartmentForStudent02);

  }

  private static void codeChallenge4() {

    Teacher teacher = new Teacher();
    StudentObs s01 = new StudentObs("Popescu");
    StudentObs s02 = new StudentObs("Ionescu");
    StudentObs s03 = new StudentObs("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[] {
            "basics",
            "oo",
            "design patterns"
    };

    for (String javaTopic : javaTopics) {
      teacher.teach(javaTopic);
    }

  }

  public static void codeChallenge5() {

    Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy01ofArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02ofArr = Arrays.copyOf(arr, arr.length);

    AscBubbleSort asc = new AscBubbleSort();
    asc.sort(copy01ofArr);
    DescBubbleSort desc = new DescBubbleSort();
    desc.sort(copy02ofArr);

    System.out.println(Arrays.toString(copy01ofArr));
    System.out.println(Arrays.toString(copy02ofArr));

  }

  public static void codeChallenge6() {

    Person person = new Person.PersonBuilder("Ionescu").job("Programmer").drivingLicense("HD12").married(false).university("UVT").build();
    System.out.println(person);

    Person personWithoutJob = new Person.PersonBuilder("Razvan").drivingLicense("B11").married(true).university("Poli").build();
    System.out.println(personWithoutJob);

  }
}
