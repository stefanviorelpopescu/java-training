package code._4_student_effort;

public class PairOf3 {
    static public Integer stage1(Integer[] numbers)
    {
        Integer pairs = 0;
        Integer[] indexIncluded = new Integer[numbers.length];
        int nrOfIncluded = 0;
        boolean included;
        for(int i = 0;i<numbers.length-2;i++)
            for(int j = i+1;j< numbers.length-1;j++)
                for(int k = j+1;k< numbers.length;k++)
                {
                    included = false;
                    for(int l=0;l<nrOfIncluded;l++){
                        if(indexIncluded[l]==i || indexIncluded[l]==j || indexIncluded[l]==k){
                            included = true;
                            break;
                        }
                    }
                    if(!included && (numbers[i]+numbers[j]+numbers[k])==0){
                        indexIncluded[nrOfIncluded++]=i;
                        indexIncluded[nrOfIncluded++]=j;
                        indexIncluded[nrOfIncluded++]=k;
                        pairs++;
                    }
                }
        return pairs;
    }
}
