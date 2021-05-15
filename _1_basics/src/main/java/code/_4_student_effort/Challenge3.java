package code._4_student_effort;

public class Challenge3 {
    static int PairOf2(int[] array) {
        int nr = 0;
        int length = array.length;
        int i = 0;
        while (i < length - 1) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] + array[j] == 0) {
                    nr++;
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    for (int k = i; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    i--;
                    break;
                }
            }
            i++;
        }
        return nr;
    }
}
