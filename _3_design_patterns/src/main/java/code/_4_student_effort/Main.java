package code._4_student_effort;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //Challenge 2
    System.out.println("Challenge 2");
    Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
    Integer[] copy01OfArr = Arrays.copyOf(arr,arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr,arr.length);
    System.out.println();
    System.out.println("Strategy 1:");
    displaySorted(new BubbleSort(),copy01OfArr);
    System.out.println();
    System.out.println("Strategy 2:");
    displaySorted(new MergeSort(),copy02OfArr);
    //Challenge 3
    System.out.println();
    Apartment app01 = new Apartment("Crangasi01",300);
    Apartment app02 = new Apartment("Crangasi02",600);
    Apartment app03 = new Apartment("Crangasi03",350);
    Apartment app04 = new Apartment("Crangasi04",400);
    Apartment app05 = new Apartment("Crangasi05",200);

    RealEstateAgentProxy proxy = new RealEstateAgentProxy();
    proxy.represent(app01);
    proxy.represent(app02);
    proxy.represent(app03);
    proxy.represent(app04);
    proxy.represent(app05);

    Student student01 = new Student("Ionescu",500);
    Student student02 = new Student("Popescu",350);
    System.out.println();
    System.out.println("Challenge 3");
    Apartment apartmentForStudent01 = proxy.rent(student01);
    //System.out.println(student01 + " rented " + apartmentForStudent01);
    System.out.println(student01.getName() + " rented " + apartmentForStudent01.getLocation());
    Apartment apartmentForStudent02 = proxy.rent(student02);
    //System.out.println(student02 + " rented " + apartmentForStudent02);
    System.out.println(student02.getName() + " rented " + apartmentForStudent02);

    //Challenge 4
    System.out.println();
    System.out.println("Challenge 4");
    Teacher teacher = new Teacher();
    Student s01 = new Student("Popescu");
    Student s02 = new Student("Ionescu");
    Student s03 = new Student("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[]{"basics","oo","design patterns"};

    for(int i = 0;i<javaTopics.length;i++){
      teacher.teach(javaTopics[i]);
    }

    //Challenge 5
    System.out.println();
    System.out.println("Challenge 5");
    Person person01 = new Person.Builder("Szene")
            .job("Software engineer")
            .university("UPB")
            .isMarried(false)
            .build();
    System.out.println(person01.toString());
    Person person02 = new Person.Builder("Rucareanu")
            .university("UPB")
            .drivingLicense("B")
            .isMarried(false)
            .build();
    System.out.println(person02.toString());
  }
  public static void displaySorted(SortingStrategy sortingStrategy,Integer[] list){
    sortingStrategy.sort(list);
    for(int i = 0;i<list.length;i++){
      System.out.print(list[i]+" ");
    }
  }
}
