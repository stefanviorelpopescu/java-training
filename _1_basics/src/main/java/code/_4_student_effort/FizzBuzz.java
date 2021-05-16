package code._4_student_effort;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FizzBuzz {

    private Map<Integer,String> pairs;
    public FizzBuzz(){
        pairs = new HashMap<Integer,String>();
    }

    public void addPair(Integer number, String word){
        pairs.put(number,word);
    }
    public String getWordFromMap(Integer number){
        String word = "";
        Set<Integer> keySet = pairs.keySet();
        for(Integer i : keySet){
            if(number%i == 0){
                word += pairs.get(i);
            }
        }
        return word;
    }
    public void printNumbers(){
        addPair(3,"Fizz");
        addPair(5, "Buzz");
        addPair(7, "Rizz");
        addPair(11, "Jazz");
        for(int i=1; i<=100; i++){
            if(getWordFromMap(i).isEmpty()){
                System.out.print(i + ", ");
            }
            else {
                System.out.print(getWordFromMap(i) + " ,");
            }
        }
    }

}
