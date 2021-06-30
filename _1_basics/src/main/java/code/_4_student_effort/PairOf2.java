package code._4_student_effort;

public class PairOf2 {
    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[]{3, 2, -3, -2, 3, 0}));
        System.out.println(numberOfPairs(new int[]{1, 1, 0, -1, -1}));
        System.out.println(numberOfPairs(new int[]{5, 9, -5, 7, -5}));
        System.out.println(numberOfPairs(new int[]{3, -3, 4, -4, 3, -4, 5, -5, 5}));
    }

    public static int numberOfPairs(int[] array) {
        int pairs = 0;
        boolean[] visited = new boolean[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if (!visited[i]) {
                visited[i] = true;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == 0 && !visited[j]) {
                        visited[j] = true;
                        pairs++;
                        break;
                    }
                }
            }
        }
        return pairs;
    }
}

