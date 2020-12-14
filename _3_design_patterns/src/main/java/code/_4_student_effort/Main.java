package code._4_student_effort;


import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    System.out.println("Challenge3");
    challenge3();
    System.out.println("\nChallenge4");
    challenge4();
    System.out.println("\nChallenge5");
    challenge5();
    System.out.println("\nChallenge6");
    challenge6();
  }

  public static void challenge3() {
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

  public static void challenge4() {
    Teacher teacher= new Teacher();
    Studentv2 s01 = new Studentv2("Popescu");
    Studentv2 s02 = new Studentv2("Ionescu");
    Studentv2 s03 = new Studentv2("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[]{
            "basics",
            "oo",
            "design patterns"
    };
    for (int i = 0; i < javaTopics.length; i++) {
      teacher.teach(javaTopics[i]);
    }

  }
  public static void challenge5()
  {
    Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    AscBubleSort asc= new AscBubleSort();
    asc.sort(copy01OfArr);
    DescBubleSort desc= new DescBubleSort();
    desc.sort(copy02OfArr);

    displaySorted(copy01OfArr);
    displaySorted(copy02OfArr);
  }
  public static void challenge6()
  {
  Person person1=new Person.Builder("Catalin")
          .job("student")
          .university("ETTI")
          .drivingLicense("B")
          .isMaried(false)
          .build();
    System.out.println(person1.toString());
  Person person2=new Person.Builder("Gabi")
          .job("taxi")
          .drivingLicense("B")
          .isMaried(true)
          .build();
    System.out.println(person2.toString());
  }
  public static void displaySorted(Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  }

