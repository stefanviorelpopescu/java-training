package code._4_student_effort;

public class PairsMain {
    public static void main(String[] args) {
        // Stage 1
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

//        Running runningShoe3 = new Running("RED",41);
//        Boot bootShoe1 = new Boot("BLACK",45);
//        Pair<Running> pairKO = new Pair<>(runningShoe3,bootShoe1);

        // Stage 2
        Running runningShoe3 = new Running("RED", 41);
        Running runningShoe4 = new Running("RED", 42);
        Pair<Running> pairOK2 = new Pair<>(runningShoe3, runningShoe4);

    }
}
