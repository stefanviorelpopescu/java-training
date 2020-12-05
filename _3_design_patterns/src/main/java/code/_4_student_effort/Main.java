package code._4_student_effort;

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

    Student student01 = new Student("Ionescu", 500);
    Student student02 = new Student("Popescu", 330);

    Apartment apartmentForStudent01 = proxy.rent(student01);
    System.out.println(student01 + " rented " + apartmentForStudent01);
    Apartment apartmentForStudent02 = proxy.rent(student02);
    System.out.println(student02 + " rented " + apartmentForStudent02);
  }

  public static void CodeChallenge4() {

  }

  public static void main(String[] args) {
    //TODO put your code changes in here

    //CodeChallenge1();
    //CodeChallenge2();
    CodeChallenge3();
    //CodeChallenge4();
  }

  public static void displaySorted(SortingStrategy strategy, Integer[] arr) {

    strategy.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
