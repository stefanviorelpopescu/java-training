package code._4_student_effort._2_challengeTwo;

public class StrategyMethod {
    public SortingStrategy strategy;
    public int[] a;

    public StrategyMethod(SortingStrategy strategy, int[] a) {
        this.strategy = strategy;
        this.a = a;
    }

    public void displaySorted(SortingStrategy strategy, int[] a) {
        strategy.sort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
