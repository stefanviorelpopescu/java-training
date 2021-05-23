package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
//  CodeChallengeOne cCI=new CodeChallengeOne();
//  cCI.runStage1();
  //CodeChallengeTwo cCII=new CodeChallengeTwo();
    //System.out.println(cCII.compute(2));
    //System.out.println(cCII.compute2(101010));
    Integer[] numbers={3,2,-3,-2,3,0};
    Integer[] numbers2={1,1,0,-1,-1};
    Integer[] numbers3={5,9,-5,7,-5};
    Integer[] numbers4={-1,-1,-1,2};

    CodeChallengeThree cCIII=new CodeChallengeThree();
    System.out.println(cCIII.RunCodeChallengeThree(numbers3));

    CodeChallengeFour cCIV=new CodeChallengeFour();
    System.out.println(cCIV.RunCodeChallengeFour(numbers4));
  }
}
