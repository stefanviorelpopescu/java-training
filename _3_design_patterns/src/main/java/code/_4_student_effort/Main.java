package code._4_student_effort;

import code._4_student_effort._hardcode_challenge_1.*;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // Challenge 1
    printChallengeSeparator(1);
    doChallenge1();

    // Challenge 2
    printChallengeSeparator(2);
    doChallenge2();

    // Challenge 3
    printChallengeSeparator(3);
    doChallenge3();

    // Challenge 4
    printChallengeSeparator(4);
    doChallenge4();

    // Challenge 4
    printChallengeSeparator(4);
    doChallenge4();

    // Challenge 5
    printChallengeSeparator(5);
    doChallenge5();

    // Challenge 6
    printChallengeSeparator(6);
    doChallenge6();

    // HardCore Challenge 1
    printChallengeSeparator(11);
    doHardCoreChallenge1();

    // HardCore Challenge 2
    printChallengeSeparator(12);
    doHardCoreChallenge2();
  }

  // Challenge 1 usage in main function
  public static void doChallenge1() {
    int[] arr = new int[] { 1, 2, 3 };
    ArrayCustomIterator it = new ArrayCustomIterator(arr);

    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }

  // Challenge 2 usage in main function
  public static void doChallenge2() {
    Integer[] arr = new Integer[] { 1, 4, 5, 2, 3, 6, 9, 8, 7 };
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    displaySorted(new BubleSort(), copy01OfArr);
    displaySorted(new MergeSort(), copy02OfArr);
  }

  // Method called in doChallenge2()
  public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
    strategy.sort(arr);
    System.out.println(Arrays.toString(arr));
  }

  // Challenge 3 usage in main function
  public static void doChallenge3() {
    Apartament app01 = new Apartament("Crangasi01", 300);
    Apartament app02 = new Apartament("Crangasi01", 600);
    Apartament app03 = new Apartament("Crangasi01", 350);
    Apartament app04 = new Apartament("Crangasi01", 400);
    Apartament app05 = new Apartament("Crangasi01", 200);

    RealEstateAgentProxy proxy = new RealEstateAgentProxy();
    proxy.represent(app01);
    proxy.represent(app02);
    proxy.represent(app03);
    proxy.represent(app04);
    proxy.represent(app05);

    Student student01 = new Student("Ionescu", 500);
    Student student02 = new Student("Popescu", 330);

    Apartament apartamentForStudent01 = proxy.rent(student01);
    System.out.println(student01 + " rented " + apartamentForStudent01);
    Apartament apartamentForStudent02 = proxy.rent(student02);
    System.out.println(student02 + " rented " + apartamentForStudent02);
  }

  // Challenge 4 usage in main function
  public static void doChallenge4() {
    Teacher teacher = new Teacher();
    StudentClass s01 = new StudentClass("Popescu");
    StudentClass s02 = new StudentClass("Ionescu");
    StudentClass s03 = new StudentClass("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[] {
            "basics",
            "oo",
            "design patterns"
    };
    for (int i = 0; i < javaTopics.length; i++) {
      teacher.teach(javaTopics[i]);
    }
  }

  // Challenge 5 usage in main function
  public static void doChallenge5() {
    Integer[] arr = new Integer[] { 1, 4, 5, 2, 3, 6, 9, 8, 7 };
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    AscBubleSort asc = new AscBubleSort();
    asc.sort(copy01OfArr);
    DescBubleSort desc = new DescBubleSort();
    desc.sort(copy02OfArr);

    displaySorted(copy01OfArr);
    displaySorted(copy02OfArr);
  }

  // Method called in doChallenge5()
  public static void displaySorted(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  // Challenge 6 usage in main function
  public static void doChallenge6() {
    Person person01 = new Person.Builder("Popescu").build();
    System.out.println(person01);

    Person person02 = new Person.Builder("Ionescu").setMaried(true).build();
    System.out.println(person02);

    Person person03 = new Person.Builder("Dumitrescu").setJob("Java Software Engineer").setUniversity("UPB").build();
    System.out.println(person03);
  }

  // HardCore Challenge 1 usage in main function
  public static void doHardCoreChallenge1() {
    DecorableTree christmasTree = new ChristmasTree();
    DecorableTree decoratedTree = new Garland(new Bulb(new Candy(christmasTree)));
    decoratedTree.display();
    christmasTree.display();
  }

  // HardCore Challenge 2 usage in main function
  public static void doHardCoreChallenge2() {
    IPerson person = new code._4_student_effort._hardcode_challenge_1.Person.Builder().setName("Duke").build();
    person.walk();
    person.drink();
  }

  public static void printChallengeSeparator(int challengeNumber) {
    System.out.println("======================== Challenge" + challengeNumber +
            " ===================================");
  }
}
