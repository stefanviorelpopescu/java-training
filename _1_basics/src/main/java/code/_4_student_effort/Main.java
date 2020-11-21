package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    Fizz(); // test challenge 1
    System.out.println(compute2(303)); // test challenge 2
    System.out.println(Pair(new int[]{3, 2, -3, -2, 3, 0}));
    System.out.println(Pair2(new int[]{-1,-1,-1,2}));
  }

  // coding challenge 1
  public static String FizzOutput(int number, int digit, String output) {
    String returnValue = "";

    if (number % digit == 0)
      returnValue += output;

    return returnValue;
  }

  public static void Fizz() {
    for (int i = 1; i <= 100; i++) {
      String result = "";
      result += FizzOutput(i, 3, "Fizz");
      result += FizzOutput(i, 5, "Buzz");
      result += FizzOutput(i, 7, "Rizz");
      result += FizzOutput(i, 11, "Jazz");

      if (result.equals(""))
        System.out.print(i);

      else
        System.out.print(result);

      System.out.print(", ");
    }
    System.out.println();
  }


  // coding challenge 2
  public static String CheckDivisible(int number, int digit, String output) {
    String returnValue = "";

      if (number % digit == 0)
        returnValue += output;

    return returnValue;
  }

  public static String CheckContains(int number, int digit, String output) {
    String returnValue = "";

    while (number != 0) {
      if (number % 10 == digit)
        returnValue += output;
      number /= 10;
    }

    return returnValue;
  }

  public static String compute2(int number){
      String result = "";

      result += CheckDivisible(number, 3, "Foo");
      result += CheckDivisible(number, 5, "Bar");
      result += CheckDivisible(number, 7, "Qix");

      result += CheckContains(number, 0, "*");
      result += CheckContains(number, 3, "Foo");
      result += CheckContains(number, 5, "Bar");
      result += CheckContains(number, 7, "Qix");

      if (result.equals("") && !String.valueOf(number).contains("0"))
        return String.valueOf(number);
      else if (result.equals("") || result.equals("*"))
        return String.valueOf(number).replace("0","*");
      else
        return result;
  }

  //coding challenge 3
  public static int Pair(int[] array){
    int pairsNumber = 0;

    for (int i = 0; i < array.length - 1; i++)
      for (int j = i + 1; j < array.length; j++)
        if(array[i] + array[j] == 0 && array[i] != 0 && array[j] != 0){
          pairsNumber++;
          array[i] = 0; array[j] = 0;
          break;
        }

    return pairsNumber;
  }

  // coding challenge 4
  public static int Pair2(int[] array){
    int pairsNumber = 0;

    for (int i = 0; i < array.length - 2; i++)
      for (int j = i + 1; j < array.length - 1; j++)
          for(int k = j + 1; k < array.length; k++)
            if(array[i] + array[j] + array[k] == 0 && array[i] != 0 && array[j] != 0 && array[k] != 0){
              pairsNumber++;
              array[i] = 0; array[j] = 0; array[k] = 0;
              break;
          }

    return pairsNumber;
  }
}




