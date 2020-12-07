package code._4_student_effort;

import java.util.Arrays;

public class Main {

  static void displaySorted(SortingStrategy strategy, Integer[] arr){
    strategy.sort(arr);

    for (Integer integer : arr) {
      System.out.println(integer + " ");
    }
  }

  public static void displaySorted(Integer[]arr){
    for (Integer integer : arr) {
      System.out.print(integer + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    //TODO put your code changes in here

    //Challange 1
    int[] arr = new int[] {1, 2, 3, 4 ,5 ,6};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);
    while(it.hasNext()){
      System.out.println(it.next());
    }
    System.out.println("----------------------------------\n");




    //Challange 2
    Integer[] arr2 = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy01OfArr = Arrays.copyOf(arr2, arr2.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr2, arr2.length);
    displaySorted(new BubbleSort(), copy01OfArr);
    System.out.println();
    displaySorted(new MergeSort(), copy02OfArr);
    System.out.println("----------------------------------\n");




    //Challange 3
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
    System.out.println("----------------------------------\n");





    //Challange 4
    Teacher teacher = new Teacher();
    Student s01 = new Student("Popescu");
    Student s02 = new Student("Ionescu");
    Student s03 = new Student("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[]{
            "basics",
            "oo",
            "design patterns"
    };
    for (String javaTopic : javaTopics) {
      teacher.teach(javaTopic);
    }
    System.out.println("----------------------------------\n");





    //Challange 5
    Integer[] arr5 = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy03OfArr = Arrays.copyOf(arr5, arr5.length);
    Integer[] copy04OfArr = Arrays.copyOf(arr5, arr5.length);

    AscBubbleSort asc = new AscBubbleSort();
    asc.sort(copy03OfArr);
    DescBubbleSort desc = new DescBubbleSort();
    desc.sort(copy04OfArr);

    displaySorted(copy03OfArr);
    displaySorted(copy04OfArr);
    System.out.println("----------------------------------\n");




    //Challange 6
    Person person = new Person.Builder("George")
            .setDrivingLicense(true)
            .setIsMarried(false)
            .setJob("Inginer")
            .setUniversity("Poli")
            .build();
    System.out.println(person);
  }
}