package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here


    System.out.println("\nCode challenge 1 : Stage 1 - TO DO");
    for(int i = 1; i < 101; i++) {
      if((i % 3 != 0) && (i % 5 != 0)) {
        System.out.println(i);
      }
      else if(i % 3 == 0 && i % 5 != 0){
        System.out.println("Fizz");
      }
      else if(i % 5 == 0 && i % 3 != 0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println("FizzBuzz");
      }
    }

    System.out.println("\nCode challenge 1 : Stage 2 - TO DO");
    for(int i = 1; i < 100; i++) {
      if((i % 3 != 0) && (i % 5 != 0) && (i % 7 != 0) && (i % 11 != 0)) {
        System.out.println(i);
      }
      else if(i % 3 == 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0){
        System.out.println("Fizz");
      }
      else if(i % 5 == 0 && i % 3 != 0 && i % 7 != 0 && i % 11 != 0) {
        System.out.println("Buzz");
      }
      else if(i % 7 == 0 && i % 5 != 0 && i % 3 != 0 && i % 11 != 0){
        System.out.println("Rizz");
      }
      else if(i % 11 == 0 && i % 5 != 0 && i % 3 != 0 && i % 7 != 0){
        System.out.println("Jazz");
      }
      else {
        System.out.println("FizzBuzz");
      }
    }

    System.out.println("\nCode challenge 2 : Stage 1 - TO DO");

    for(int i = 0; i < 100; i++){
      String s = compute(i);
      System.out.println(s);
    }

    System.out.println("\nCode challenge 2 : Stage 2 - TO DO");

    for(int i = 0; i < 100; i++){
      String s = compute2(i);
      System.out.println(s);
    }

  }

  public static String compute(int i) {

    String FooBarQix = "";

    if(i % 3 == 0) {
      FooBarQix += "Foo";
    }
    if(i % 5 == 0) {
      FooBarQix += "Bar";
    }
    if(i % 7 == 0) {
      FooBarQix += "Qix";
    }

    char[] characters = String.valueOf(i).toCharArray();
    for(char c  : characters) {   //pune in string-ul afisat doar caracterele inlocuite
      if(c == '3') {
        FooBarQix += "Foo";
      }
      if(c == '5') {
        FooBarQix += "Bar";
      }
      if(c == '7') {
        FooBarQix += "Qix";
      }
    }

    if (FooBarQix.isEmpty()) {    //adauga in string numerele lipsa pe langa caracterele inlocuite
      FooBarQix = String.valueOf(i);
    }

    return FooBarQix;
  }

  public static String compute2(int i) {
    String newChar = "";

    if(i % 3 == 0) {
      newChar += "Foo";
    }
    if(i % 5 == 0) {
      newChar += "Bar";
    }
    if(i % 7 == 0) {
      newChar += "Qix";
    }

    char[] characters = String.valueOf(i).toCharArray();
    for(char c  : characters) {   //pune in string-ul afisat doar caracterele inlocuite
      if(c == '3') {
        newChar += "Foo";
      }
      if(c == '5') {
        newChar += "Bar";
      }
      if(c == '7') {
        newChar += "Qix";
      }

      if(c == '0') {
        newChar += "*";
      }
    }

    if (newChar.isEmpty()) {    //adauga in string numerele lipsa pe langa caracterele inlocuite
      newChar = String.valueOf(i);
    }


    return newChar;
  }
}
