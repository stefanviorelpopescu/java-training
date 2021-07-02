package code._4_student_effort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class pairOfThree {
    public static int run(ArrayList<Integer> numbers){
        
        Integer S = numbers.size();
        Collections.sort(numbers);
        Integer noPairs = 0;
        int i = 0;
        int low = 0;
        int high = 0;
        boolean pop = false;
        System.out.println(numbers);
        while (i < numbers.size() - 2){
            low = i + 1;
            high = numbers.size() - 1;
            pop = false;
            while (low < high){
                if (numbers.get(low) + numbers.get(high) < -numbers.get(i))
                    low++;
                else if (numbers.get(low) + numbers.get(high) > -numbers.get(i))
                    high--;
                else{
                    pop = true;
                    break;
                }
            }
            if (pop == true){
                noPairs++;
                numbers.remove(high);
                numbers.remove(low);
                numbers.remove(i);
                pop = false;
            }
            else if (pop == false)
                i++;
        }
        return noPairs;
        
    }
    
}
