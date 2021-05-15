package code._4_student_effort;

public class Challenge4 {
    static int PairOf3(int[] array) {
        int nr = 0;
        int length = array.length;
        int i = 0;
        while (i < length - 2) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int l = j + 1; l < length; l++) {
                    if (array[i] + array[j] + array[l] == 0) {
                        nr++;
                        for (int k = l; k < length - 1; k++) {
                            array[k] = array[k + 1];
                        }
                        length--;
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
            }
            i++;
        }
        return nr;
    }
}
