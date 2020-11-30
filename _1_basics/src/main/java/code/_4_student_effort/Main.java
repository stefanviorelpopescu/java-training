package code._4_student_effort;

public class Main {

  public static void CodeChallenge1() {

    FirstChallenge firstChallenge = new FirstChallenge();
    firstChallenge.showInformationsAboutChallenge();

    firstChallenge.run();

  }

  public static void CodeChallenge2() {

    SecondChallenge secondChallenge = new SecondChallenge();
    secondChallenge.showInformationsAboutChallenge();

    int number = 33;
    secondChallenge.run(15);
    secondChallenge.run(101);
    secondChallenge.run(303);
    secondChallenge.run(105);
    secondChallenge.run(10101);

  }

  public static void CodeChallenge3() {

    ThirdChallenge thirdChallenge = new ThirdChallenge();
    thirdChallenge.showInformationsAboutChallenge();

    int []array = {3,2,-3,-2,3,0};
    thirdChallenge.run(array);
    array = new int[]{1, 1, 0, -1, -1};
    thirdChallenge.run(array);
    array = new int[]{5,9,-5,7,-5};
    thirdChallenge.run(array);

  }

  public static void CodeChallenge4() {

    FourthChallenge fourthChallenge = new FourthChallenge();
    fourthChallenge.showInformationsAboutChallenge();

    int []secondArray = {-1, -1, -1, 2};
    fourthChallenge.run(secondArray);

  }

  public static void main(String[] args) {

    //CodeChallenge1();
    //CodeChallenge2();
    CodeChallenge3();
    //CodeChallenge4();
  }
}
