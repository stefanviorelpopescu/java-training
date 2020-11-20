package code._4_student_effort;

public class PairOf3 {

    public static void main(String[] args) {
        // Code Challenge 4
        Integer[] values = {-1, -1, -1, 2};
        int pairs = countPairs(values, 0);
        System.out.println("Number of pairs: " + pairs);
    }

    public static Integer countPairs(Integer[] numbers, int sum) {
        Integer pairs = 0;
        Integer[] indexes = new Integer[numbers.length];
        int nrIndexes = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    boolean indexesCheck = false;
                    for (int p = 0; p < nrIndexes; p++) {
                        if (indexes[p] == i || indexes[p] == j || indexes[p] == k) {
                            indexesCheck = true;
                        }
                    }
                    if (!indexesCheck && (numbers[i] + numbers[j] + numbers[k] == 0)) {
                        indexes[nrIndexes++] = i;
                        indexes[nrIndexes++] = j;
                        indexes[nrIndexes++] = k;
                        pairs++;
                        System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = " + sum);
                        break;
                    }
                }
            }
        }
        return pairs;
    }

}
