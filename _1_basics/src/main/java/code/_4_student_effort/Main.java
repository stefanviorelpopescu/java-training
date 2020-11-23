package code._4_student_effort;

public class Main {

  public static void FizzBuzz(int number){
    for(int i = 1; i < number; i++){
      if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz ");
        continue;
      }
      if(i % 3 == 0){
        System.out.println("Fizz" );
        continue;
      }
      if(i % 5 == 0){
        System.out.println("Buzz ");
        continue;
      }
      if(i % 7 == 0){
        System.out.println("Rizz ");
        continue;
      }
      if(i % 11 == 0){
        System.out.println("Jazz ");
        continue;
      }
      System.out.println(i + " ");
    }
  }

  public static String compute2(int number){
      String s1 = "";
      if (number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
        s1 = s1 + (number);
      } else {
        if (number % 3 == 0)
          s1 = s1 + ("Foo");
        if (number % 5 == 0)
          s1 = s1 + ("Bar");
        if (number % 7 == 0)
          s1 = s1 + ("Qix");
        s1 = s1 + number;
        s1 = s1.replace("1", "");
        s1 = s1.replace("2", "");
        s1 = s1.replace("4", "");
        s1 = s1.replace("6", "");
        s1 = s1.replace("8", "");
        s1 = s1.replace("9", "");
      }
      s1 = s1.replace('0', '*');
      s1 = s1.replace("3", "Foo");
      s1 = s1.replace("5", "Bar");
      s1 = s1.replace("7", "Qix");
      return s1;
  }

  public static void PairOf2(int[] numbers){
    int pairs = 0;
    for (int i = 0; i < numbers.length - 1; i++){
      for(int j = i + 1; j < numbers.length; j++){
        if(numbers[i] + numbers[j] == 0 && numbers[i] != 0){
          pairs ++;
          numbers[i] = 0;
          numbers[j] = 0;
        }
      }
    }
    System.out.println(pairs);
  }

  public static void PairOf3(int[] numbers){
    boolean[] index = new boolean[numbers.length];
    int pairs = 0;
    for (int i = 0; i < numbers.length - 2; i++) {
      for (int j = i + 1; j < numbers.length - 1; j++) {
        for(int k = j + 1; k < numbers.length; k++) {
          if(numbers[i] + numbers [j] + numbers[k] == 0 && (!index[i] && !index[j] && !index[k])){
            pairs ++;
            index[i] = true;
            index[j] = true;
            index[k] = true;
          }
        }
      }
    }
    System.out.println(pairs);
  }
  public static void main(String[] args) {
    //TODO put your code changes in here
    System.out.println(compute2(10101));
  }
}
