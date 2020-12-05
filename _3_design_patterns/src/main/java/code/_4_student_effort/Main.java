package code._4_student_effort;

import code._4_student_effort.Challenge1.ArrayCustomIterator;
import code._4_student_effort.Challenge2.BubbleSort;
import code._4_student_effort.Challenge2.SortingStrategy;
import code._4_student_effort.Challenge2.MergeSort;
import code._4_student_effort.Challenge3.Apartment;
import code._4_student_effort.Challenge3.RealEstateAgentProxy;
import code._4_student_effort.Challenge4.Student;
import code._4_student_effort.Challenge4.Teacher;
import code._4_student_effort.Challenge5.AscBubleSort;
import code._4_student_effort.Challenge5.DescBubleSort;

import java.util.Arrays;

public class Main {

  public static void CodeChallenge1() {

    int[] arr = new int[] {1,2,3};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public static void CodeChallenge2() {

    Integer[] arr = new Integer[(int)(Math.random() +1)*100];
    for (int i=0;i<arr.length;i++) {
      arr[i] = (int)(Math.random()*100);
    }

    Integer[] copy01Arr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02Arr = Arrays.copyOf(arr, arr.length);

    displaySorted(new BubbleSort(), copy01Arr);
    displaySorted(new MergeSort(), copy02Arr);
  }

  public static void CodeChallenge3() {
    Apartment app01 = new Apartment("Crangasi01",300);
    Apartment app02 = new Apartment("Crangasi01",600);
    Apartment app03 = new Apartment("Crangasi01",350);
    Apartment app04 = new Apartment("Crangasi01",400);
    Apartment app05 = new Apartment("Crangasi01",200);

    RealEstateAgentProxy proxy = new RealEstateAgentProxy();
    proxy.represent(app01);
    proxy.represent(app02);
    proxy.represent(app03);
    proxy.represent(app04);
    proxy.represent(app05);

    code._4_student_effort.Challenge3.Student student01 = new code._4_student_effort.Challenge3.Student("Ionescu", 500);
    code._4_student_effort.Challenge3.Student student02 = new code._4_student_effort.Challenge3.Student("Popescu", 330);

    Apartment apartmentForStudent01 = proxy.rent(student01);
    System.out.println(student01 + " rented " + apartmentForStudent01);
    Apartment apartmentForStudent02 = proxy.rent(student02);
    System.out.println(student02 + " rented " + apartmentForStudent02);
  }

  public static void CodeChallenge4() {

    Teacher teacher = new Teacher();
    Student s01 = new Student("Popescu");
    Student s02 = new Student("Ionescu");
    Student s03 = new Student("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[] {
            "basics",
            "oo",
            "design patterns"
    };

    for (int i=0;i<javaTopics.length;i++) {
      teacher.tech(javaTopics[i]);
    }
  }

  public static void CodeChallenge5() {

    Integer[] arr = new Integer[] {1,4,5,2,3,6,9,8,7};
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    AscBubleSort asc = new AscBubleSort();
    asc.sort(copy01OfArr);

    DescBubleSort desc = new DescBubleSort();
    desc.sort(copy02OfArr);

    displaySortedChallenge5(copy01OfArr);
    displaySortedChallenge5(copy02OfArr);

  }

  public static void CodeChallenge6() {

  }



  public static void main(String[] args) {
    //TODO put your code changes in here

    //CodeChallenge1();
    //CodeChallenge2();
    //CodeChallenge3();
    //CodeChallenge4();
    CodeChallenge5();
    //CodeChallenge6();
  }



  public static void displaySorted(SortingStrategy strategy, Integer[] arr) {

    strategy.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void displaySortedChallenge5(Integer[] arr) {
    for (int i=0;i<arr.length;i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
