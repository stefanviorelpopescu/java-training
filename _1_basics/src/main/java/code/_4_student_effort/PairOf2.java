package code._4_student_effort;

public class PairOf2 {
    static public Integer stage1(Integer[] numbers) {
        Integer pairs = 0;
        Integer[] indexIncluded = new Integer[numbers.length];
        int nrOfIncluded = 0;
        boolean included;
        for(int i = 0;i< numbers.length-1 ;i++)
            for(int j = i+1;j< numbers.length;j++){
                included = false;
                for(int k=0;k<nrOfIncluded;k++)
                {
                    if(indexIncluded[k]==i||indexIncluded[k]==j)
                    {
                        included = true;
                        break;
                    }
                }
                if(!included && (numbers[i]+numbers[j]==0))
                {
                    indexIncluded[nrOfIncluded++] = i;
                    indexIncluded[nrOfIncluded++] = j;
                    pairs++;
                    break;
                }
            }
        return pairs;
    }
}
