package code._4_student_effort;

public class Challange3 {
    public Integer pairsOf2(Integer[] numbers) {
        Integer pairs = 0;
        Integer[] IncludedInPairs = new Integer[numbers.length];
        int s = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                boolean IncludedInOtherPairs = false;
                for(int k = 0; k < s; k++){
                    if(IncludedInPairs[k]==i || IncludedInPairs[k]==j){
                        IncludedInOtherPairs = true;
                    }
                }
                if(!IncludedInOtherPairs && (numbers[i] + numbers[j]==0)){
                    IncludedInPairs[s++] = i;
                    IncludedInPairs[s++] = j;
                    pairs ++;
                    break;
                }
            }
        }
        return pairs;
    }
}
