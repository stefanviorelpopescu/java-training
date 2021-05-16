package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class PairOf3 {
    List<Integer> integers;

    public PairOf3(){
        integers = new ArrayList<>();
        integers.add(-1);
        integers.add(-1);
        integers.add(-1);
        integers.add(2);
    }

    public int getNumberOfPairs(){
        boolean found;
        int numberOfPairs = 0;
        int sum;
        for(int i=0; i < integers.size(); i++){
            found = false;
            sum = integers.get(i);
            for(int j=i+1; j < integers.size() && !found; j++){
                sum += integers.get(j);
                for(int k=j+1; k < integers.size() && !found; k++){
                    sum += integers.get(k);
                    if(sum == 0){
                        found = true;
                        integers.remove(k);
                    }
                }
                if(found){
                    integers.remove(j);
                }
            }
            if(found){
                integers.remove(i);
                i--;
                numberOfPairs++;
            }
        }
        return  numberOfPairs;
    }
}
