package code._4_student_effort;

public class Challenge4 {
    public static int Pairof3(int [] array)
    {
        int s=0;
        for(int i=0; i<array.length; i++)
            for (int j = i + 1; j < array.length; j++)
                for (int k = j + 1; k < array.length; k++)
                    if (array[i] + array[j] + array[k] == 0)
                    {
                        s++;
                        i+=3;
                        j+=3;
                        break;
                    }
        return s;
    }
}
