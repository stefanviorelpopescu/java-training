package code._4_student_effort;

public class PairOf2 {

    public static void main(String[] args) {
        // Code Challenge 3
        Integer[] values = {3, 2, -3, -2, 3, 0};
        int pairs = countPairs(values);
        System.out.println("Number of pairs: " + pairs);
    }

    public static Integer countPairs(Integer[] numbers) {
        Integer pairs = 0;
        Integer[] indexes = new Integer[numbers.length];
        int nrIndexes = 0;

        for ( int i = 0; i < numbers.length - 1; i++ ) {
            for ( int j = i + 1; j < numbers.length; j++ ) {
                boolean indexesCheck = false;
                for ( int k = 0; k < nrIndexes; k++ ) {
                    if ( indexes[k] == i || indexes[k] == j ) {
                        indexesCheck = true;
                    }
                }
                if ( !indexesCheck && (numbers[i] + numbers[j] == 0) ) {
                    indexes[nrIndexes++] = i;
                    indexes[nrIndexes++] = j;
                    pairs++;
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + 0);
                    break;
                }
            }
        }
        return pairs;
    }
}