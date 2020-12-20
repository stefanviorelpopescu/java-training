package code._4_student_effort.secondChallenge;

public class TestPair {
    public static void main(String[] args) {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);


     //   The following gives error
//        Running runningShoe3 = new Running("RED", 41);
//        Boot bootShoe = new Boot("Black", 45);
//        Pair<Running> PairKO = new Pair<>(runningShoe3, bootShoe);


        Running runningShoe4 = new Running("RED", 41);
        Running runningShoe5 = new Running("RED", 42);
        Pair<Running> pairOK2 = new Pair<>(runningShoe4, runningShoe5);

        
        
    }
    
}
