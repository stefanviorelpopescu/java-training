package code._4_student_effort;

public class TestChallenge2 {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1,runningShoe2);

        Running runningShoe3 = new Running("RED", 41);
        Running runningShoe4 = new Running("BLACK", 45);
        Pair<Running> pairNotOk = new Pair<>(runningShoe3,runningShoe4);
        Boot bootShoe = new Boot("RED", 45);
        //Pair<Running> pairOk = new Pair<>(runningSHoe3,bootShoe);
    }
}
