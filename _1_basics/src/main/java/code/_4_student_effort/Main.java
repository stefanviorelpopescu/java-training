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

    System.out.println("\nCode challenge 3 - TO DO");
    Integer[] array;
    array = new Integer[] {2, -2, 1, 3, -3};
    Integer x = countPairs(array);
    System.out.println("No. of pairs is " + x);

    System.out.println("\nCode challenge 4 - TO DO");
    Integer[] array1;
    array1 = new Integer[] {2, -2, 1, 3, -3, 4, -1, 5, -4};
    Integer x1 = countPairs(array1);
    System.out.println("No. of pairs is " + x1);

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

  public static Integer countPairs(Integer[] givenArray) {
    Integer[] array = new Integer[givenArray.length];
    Integer nrOfPairs = 0;
    int nrOfReIndexesInPairs = 0;

    for(int i = 0; i < givenArray.length - 1; i++) {
      for(int j = i + 1; j < givenArray.length; j++) {
        boolean ok = false;
        for(int k = 0; k < nrOfReIndexesInPairs; k++) {
          if(array[k] == i || array[k] == j) {
            ok = true;
          }
        }
        if(!ok && (givenArray[i] + givenArray[j] == 0)) {
          array[nrOfReIndexesInPairs++] = i;
          array[nrOfReIndexesInPairs++] = j;
          nrOfPairs++;
          break;
        }
      }
    }
    return nrOfPairs;
  }

  public static Integer countPairs2(Integer[] givenArray) {
    Integer[] array = new Integer[givenArray.length];
    Integer nrOfPairs = 0;
    int nrOfReIndexesInPairs = 0;

    for(int i = 0; i < givenArray.length - 2; i++) {
      for(int j = i + 1; j < givenArray.length - 1; j++) {
        for(int k = j +1; k < givenArray.length; k++) {
          boolean ok = false;
          for (int l = 0; l < nrOfReIndexesInPairs; l++) {
            if (array[l] == i || array[l] == j || array[l] == k) {
              ok = true;
            }
          }
          if (!ok && (givenArray[i] + givenArray[j] + givenArray[k] == 0)) {
            array[nrOfReIndexesInPairs++] = i;
            array[nrOfReIndexesInPairs++] = j;
            array[nrOfReIndexesInPairs++] = k;
            nrOfPairs++;
            break;
          }
        }
      }
    }
    return nrOfPairs;
  }
}
