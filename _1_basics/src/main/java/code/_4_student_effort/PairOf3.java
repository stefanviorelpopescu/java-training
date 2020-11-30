package code._4_student_effort;

public class PairOf3 {
    public static int contorizeaza (int[] array)
    {int p=0;
        int []ap=new int[array.length];

        //vom folosi un vector de aparitii
        for(int i=0;i<array.length-2;i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (ap[i] != 0 || ap[j] != 0)
                        continue;
                    if ((array[i] + array[j]) == 0) {
                        ap[i]++;
                        ap[j]++;
                        ap[k]++;
                        p++;
                        break;
                    }
                }
            }
        }
        return p;
    }
}
