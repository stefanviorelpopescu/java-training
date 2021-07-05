package code._4_student_effort;

import code._4_student_effort._1_challengeOne.ArrayCustomIterator;
import code._4_student_effort._2_challengeTwo.BubbleSort;
import code._4_student_effort._2_challengeTwo.MergeSort;
import code._4_student_effort._2_challengeTwo.StrategyMethod;
import code._4_student_effort._3_challengeThree.Apartment;
import code._4_student_effort._3_challengeThree.RealEstateAgentProxy;
import code._4_student_effort._3_challengeThree.Student;
import code._4_student_effort._4_challengeFour.StudentCh4;
import code._4_student_effort._4_challengeFour.Teacher;
import code._4_student_effort._5_challengeFive.AscBubbleSort;
import code._4_student_effort._5_challengeFive.DescBubbleSort;
import code._4_student_effort._6_challengeSix.Person;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

    // challenge one
    System.out.println("Code Challenge One");

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    ArrayCustomIterator itr = new ArrayCustomIterator(list);
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    System.out.println("----------");

    // challenge two
    System.out.println("Code Challenge Two");

    int[] a = new int[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
    int[] copy01OfArr = Arrays.copyOf(a, a.length);
    int[] copy02OfArr = Arrays.copyOf(a, a.length);
    StrategyMethod strategyMethod = new StrategyMethod(new BubbleSort(), copy01OfArr);
    StrategyMethod strategyMethod2 = new StrategyMethod(new MergeSort(), copy02OfArr);

    strategyMethod.displaySorted(new BubbleSort(), copy01OfArr);
    strategyMethod2.displaySorted(new MergeSort(), copy01OfArr);

    System.out.println("----------");

    // challenge three
    System.out.println("Code Challenge Three");

    Apartment ap1 = new Apartment("Crangasi01", 300);
    Apartment ap2 = new Apartment("Crangasi01", 600);
    Apartment ap3 = new Apartment("Crangasi01", 350);
    Apartment ap4 = new Apartment("Crangasi01", 400);
    Apartment ap5 = new Apartment("Crangasi01", 200);

    RealEstateAgentProxy realEstateAgentProxy = new RealEstateAgentProxy();
    realEstateAgentProxy.represent(ap1);
    realEstateAgentProxy.represent(ap2);
    realEstateAgentProxy.represent(ap3);
    realEstateAgentProxy.represent(ap4);
    realEstateAgentProxy.represent(ap5);

    Student student1 = new Student("Ionescu", 500);
    Student student2 = new Student("Popescu", 330);

    Apartment apartmentForStudent1 = realEstateAgentProxy.rent(student1);
    System.out.println(student1 + " rented " + apartmentForStudent1 + ".");
    Apartment apartmentForStudent2 = realEstateAgentProxy.rent(student2);
    System.out.println(student2 + " rented " + apartmentForStudent2 + ".");

    System.out.println("----------");

    // challenge four
    System.out.println("Code Challenge Four");

    Teacher teacher = new Teacher();
    StudentCh4 s01 = new StudentCh4("Popescu");
    StudentCh4 s02 = new StudentCh4("Ionescu");
    StudentCh4 s03 = new StudentCh4("Dragomirescu");

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

    System.out.println("----------");

    // challenge five
    System.out.println("Code Challenge Five");

    Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy03OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy04OfArr = Arrays.copyOf(arr, arr.length);

    AscBubbleSort asc = new AscBubbleSort();
    asc.sort(copy03OfArr);
    DescBubbleSort desc = new DescBubbleSort();
    desc.sort(copy04OfArr);

    displaySorted(copy03OfArr);
    displaySorted(copy04OfArr);

    System.out.println("----------");

    // challenge six
    System.out.println("Code Challenge Six");

    Person p1 = new Person.PersonBuilder("Andrei")
            .university("USAMV")
            .isMarried(false)
            .build();
    Person p2 = new Person.PersonBuilder("Flaviu")
            .drivingLicense(true)
            .build();
    Person p3 = new Person("Ionut");
    Person p4 = new Person.PersonBuilder("Andreea")
            .job("Software Developer")
            .university("GAD")
            .isMarried(true)
            .drivingLicense(false)
            .build();
  }

  public static void displaySorted(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
