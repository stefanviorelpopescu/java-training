package code._4_student_effort._2_pairs;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 2 ----" + ANSI_RESET);

        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pair1 = new Pair<>(runningShoe1,runningShoe2);

        Running runningShoe3 = new Running("RED", 41);
        Running runningShoe4 = new Running("RED", 42);
        Pair<Running> pair2 = new Pair<>(runningShoe3,runningShoe4);

        Running runningShoe5 = new Running("GREEN", 41);
        Running runningShoe6 = new Running("RED", 41);
        Pair<Running> pair3 = new Pair<>(runningShoe5,runningShoe6);

        Boot bootShoe = new Boot("BLACK", 45);
        //Pair<Running> pair4 = new Pair<>(runningShoe3,bootShoe);
    }
}
