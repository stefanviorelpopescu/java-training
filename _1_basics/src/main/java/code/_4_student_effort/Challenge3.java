package code._4_student_effort;



public class Challenge3 {
    public static int NrofPairs(int[] array)
    {
        int k=0;
        for(int i=0; i<array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                if (array[i] + array[j] == 0)
                {
                    k++;
                    break;
                }
        return k;
    }

}
