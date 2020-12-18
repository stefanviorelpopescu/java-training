package code._4_student_effort;

import code._4_student_effort.Challenge2.Boot;
import code._4_student_effort.Challenge2.Pair;
import code._4_student_effort.Challenge2.Running;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    challenge2();
  }

  public static void challenge2() {

    Running runningShoe1 = new Running("RED", 41);
    Running runningShoe2 = new Running("RED", 41);
    Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

    // the following gives error, which is ok
    /*
    Running runningShoe3 = new Running("RED",41);
    Boot bootShoe = new Boot("BLACK", 45);
    Pair<Running> pairKO = new Pair<>(runningShoe3, bootShoe);
     */

    Running running5 = new Running("RED",41);
    Running running6 = new Running("RED", 42);
    Pair<Running> pairOK2 = new Pair<>(running5, running6);

  }
}
