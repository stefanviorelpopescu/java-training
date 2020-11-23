package code._4_student_effort;

public class Challenge3 {
    public int nrOfPairs(Integer[] vector) {
        int len = vector.length;
        Integer aux[] = new Integer[len];
        for(int i = 0; i < aux.length; i++) {
            aux[i] = 0;
        }
        int nr = 0, idx = -1, a;
        for (int i = 0; i < len; i++) {
            if (vector[i] != 0) {
                a = -vector[i];
                idx = findIndex(vector, a);

                if ((idx != -1) && (aux[idx] == 0)) {
                    vector[idx] = 0;
                    aux[idx] = 1;
                    aux[i] = 1;
                    nr++;
                }
            }

        }
        return nr;
    }

    public int findIndex(Integer arr[], Integer t)
    {

        if (arr == null) {
            return -1;
        }

        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }
}
