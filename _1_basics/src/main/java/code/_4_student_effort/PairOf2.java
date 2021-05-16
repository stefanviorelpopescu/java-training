package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class PairOf2 {
    List<Integer> integers;

    public PairOf2(){
        integers = new ArrayList<>();
        integers.add(3);
        integers.add(2);
        integers.add(-3);
        integers.add(-2);
        integers.add(3);
        integers.add(0);
    }

    public int getNumberOfPairs(){
        boolean found;
        int numberOfPairs = 0;
        for(int i=0; i < integers.size(); i++){
            found = false;
            for(int j=i+1; j < integers.size() && !found; j++){
                if(integers.get(i) == -integers.get(j)){
                    integers.remove(j);
                    found = true;
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
