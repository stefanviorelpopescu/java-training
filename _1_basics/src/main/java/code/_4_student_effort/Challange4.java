package code._4_student_effort;

public class Challange4 {
    public Integer pairsOf3(Integer[] numbers) {
        Integer pairs = 0;
        Integer[] IncludedInPairs = new Integer[numbers.length];
        int s = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    boolean IncludedInOtherPairs = false;
                    for (int p = 0; p < s; p++) {
                        if (IncludedInPairs[p] == i || IncludedInPairs[p] == j || IncludedInPairs[p] == k) {
                            IncludedInOtherPairs = true;
                        }
                    }
                    if (!IncludedInOtherPairs && (numbers[i] + numbers[j] + numbers[k] == 0)) {
                        IncludedInPairs[s++] = i;
                        IncludedInPairs[s++] = j;
                        IncludedInPairs[s++] = k;
                        pairs++;
                        break;
                    }
                }
            }
        }
        return pairs;
    }
}
