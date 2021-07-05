package code._4_student_effort._2_challengeTwo;

public class Main {
    public static void main(String[] args) throws Exception {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

//        Running runningShoe3 = new Running("RED", 41);
//        Boot bootShoe1 = new Boot("BLACK", 45);
//        Pair<Running> pairOK2 = new Pair<>(runningShoe3, bootShoe1);

        Running runningShoe4 = new Running("RED", 41);
        Running runningShoe5 = new Running("BLACK", 41);
        Pair<Running> pairOK3 = new Pair<>(runningShoe4, runningShoe5);
    }
}
