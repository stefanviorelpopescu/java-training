package code._4_student_effort;

import code._2_challenge._2_strategy.BubleSort;
import code._2_challenge._2_strategy.MergeSort;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    //Code Challenge 1
    int [] arr = new int[] {1,2,3};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);
    while(it.hasNext()){
      System.out.println(it.next());
    }

    //Code Challenge 2
    Integer[] array = new Integer[]{1,4,2,3,6,9,8,7};
    Integer[] copy01OfArr = Arrays.copyOf(array,array.length);
    Integer[] copy02OfArr = Arrays.copyOf(array,array.length);

    displaySorted(new BubleSortStrategy(), copy01OfArr);
    displaySorted(new MergeSortStrategy(), copy02OfArr);

   // Code Challenge 3
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

    Student student01 = new Student("Ionescu",500);
    Student student02 = new Student("Popescu",330);

    //Apartment app[] = new Apartment[]{app01,app02,app03,app04,app05};

    Apartment apartmentForStudent01 = proxy.rent(student01);
    System.out.println(student01 + "rented "+ apartmentForStudent01);
    Apartment apartmentForStudent02 = proxy.rent(student02);
    System.out.println(student02 + "rented "+apartmentForStudent02);

    //Code Challenge 4
    Teacher teacher = new Teacher();
    Student4 s01 = new Student4("Popescu");
    Student4 s02 = new Student4("Ionescu");
    Student4 s03 = new Student4("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[]{
            "basics",
            "oo",
            "design patterns"
    };
    for(int i=0; i<javaTopics.length; i++){
      teacher.teach(javaTopics[i]);
    }

    //Code Challenge 5
    Integer[] ar = new Integer[]{1,4,5,2,3,6,9,8,7};
    Integer[] copy1OfAr = Arrays.copyOf(ar,ar.length);
    Integer[] copy2OfAr = Arrays.copyOf(ar,ar.length);

    AscBubbleSort asc = new AscBubbleSort();
    asc.sort(copy1OfAr);
    DescBubbleSort desc = new DescBubbleSort();
    desc.sort(copy2OfAr);

    displaySort(copy1OfAr);
    displaySort(copy2OfAr);

    //Code Challenge 6
    Person pers1 = new Person.Builder("Smith")
          .job("Engineer")
          .drivingLicense("A")
          .isMarried("No")
          .university("Cambridge").build();
    System.out.println(pers1);

    //Hard Code Challenge 1
    DecorableTree christmasTree = new ChristmasTree();
    DecorableTree decoratedTree = christmasTree;
    decoratedTree = new Candy(3,christmasTree);
    decoratedTree = new Bulb(6,christmasTree);
    decoratedTree = new Garland(8,christmasTree);
    decoratedTree.display();

    //Hard Code Challenge 2
    IPerson person = new PersonHard2.Builder().setName("Duke").build();
    person.walk();
    person.drink();
  }

  private static void displaySorted(SortingStrategy sortingStrategy, Integer[] array) {
    sortingStrategy.sort(array);
    System.out.println(Arrays.toString(array));
  }

  public static void displaySort(Integer[] ar){
    for(int i=0; i < ar.length; i++){
      System.out.println(ar[i] + " ");
    }
    System.out.println();
  }

}
