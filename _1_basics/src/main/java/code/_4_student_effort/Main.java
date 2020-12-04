package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    FizzBuzzHW fizzBuzzHW = new FizzBuzzHW();
    FooBarQixHW fooBarQixHW = new FooBarQixHW();

    System.out.println();
    for ( int i = 1 ; i < 50; i++ )
      System.out.print(fooBarQixHW.compute(i)+ " ");

    System.out.println();
    for ( int i = 1 ; i < 50; i++ )
      System.out.print(fooBarQixHW.compute2(i)+ " ");
  }

}
