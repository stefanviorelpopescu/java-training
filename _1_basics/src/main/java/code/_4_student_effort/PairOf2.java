package code._4_student_effort;

public class PairOf2 {

    public static int contorizeaza (int[] array)
    {int i=0, k=0;
    int []ap=new int[array.length];

    //vom folosi un vector de aparitii
        for(i=0;i<array.length-1;i++)
        {for(int j=i+1;j<array.length;j++)
        {
            if(ap[i]!=0||ap[j]!=0)
                continue;
            if((array[i]+array[j])==0)
            {
                ap[i]++;
                ap[j]++;
                k++;
                break;
            }
        }
        }
        return k;
    }
}
