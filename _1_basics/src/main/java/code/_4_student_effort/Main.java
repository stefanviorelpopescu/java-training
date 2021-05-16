package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
	
	//First comment inserted here
	//Second comment

    FizzBuzz fb = new FizzBuzz();
    fb.printNumbers();
    System.out.println();
    System.out.println(FooBarQix.compute(105));
    System.out.println(FooBarQix.compute2(10101));

    PairOf2 po = new PairOf2();
    System.out.println(po.getNumberOfPairs());

    PairOf3 po3 = new PairOf3();
    System.out.println(po3.getNumberOfPairs());
  }
}
