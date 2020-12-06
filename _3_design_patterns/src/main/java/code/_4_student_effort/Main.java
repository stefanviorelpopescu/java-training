package code._4_student_effort;

import java.lang.reflect.AnnotatedParameterizedType;
import java.util.Arrays;

public class Main {

  public static void display(Integer[] arr){
    for(int i :arr){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public static void exBuilder(){
    Student stud = new Student.Builder("Alex")
           .setUniversity("Politehnica")
            .setMarried(true).build();
  }

  public static void exObserver(){
    Profesor profesor = new Profesor();
    Elev s1 = new Elev("Ionescu");
    Elev s2 = new Elev("Popescu");
    Elev s3 = new Elev("Dragomirescu");
    s1.listenTo(profesor);
    s2.listenTo(profesor);
    s3.listenTo(profesor);

    String[] javaTopics = new String[]{
            "basics",
            "oo",
            "design patterns"
    };
    for(String s: javaTopics)
      profesor.teach(s);
  }

  public static void exProxy(){
    Apartament ap1 = new Apartament("Crangasi01",300);
    Apartament ap2 = new Apartament("Crangasi01",600);
    Apartament ap3 = new Apartament("Crangasi01",350);
    Apartament ap4 = new Apartament("Crangasi01",400);
    Apartament ap5 = new Apartament("Crangasi01",200);
    RealEstateAgentProxy proxy = new RealEstateAgentProxy();
    proxy.represents(ap1);
    proxy.represents(ap2);
    proxy.represents(ap3);
    proxy.represents(ap4);
    proxy.represents(ap5);
    StudentProxy s1 = new StudentProxy("Ionescu",500);
    StudentProxy s2 = new StudentProxy("Popescu",330);
    Apartament apartament1 = proxy.rented(s1);
    Apartament apartament2 = proxy.rented(s2);
    System.out.println(s1+" rented "+apartament1);
    System.out.println(s2+" rented "+apartament2);

  }
  public static void exTemplate(){
    Integer[] arr = new Integer[]{
            1,4,5,2,3,6,9,8,7
    };
    Integer[] copy1 = Arrays.copyOf(arr,arr.length);
    Integer[] copy2 = Arrays.copyOf(arr,arr.length);
    AscBubbleSort asc = new AscBubbleSort();
    DescBubbleSort desc = new DescBubbleSort();
    asc.sort(copy1);
    desc.sort(copy2);
    display(copy1);
    display(copy2);
  }
  public static void main(String[] args) {
    //TODO put your code changes in here
     exObserver();
     exProxy();
     exTemplate();
  }
}
