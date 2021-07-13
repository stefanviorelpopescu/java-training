package code._4_student_effort;

import java.util.HashMap;

public class CodeChallengeOne {
    public void runStage1(){
        String wordSaid;
        int k;
        HashMap<Integer,String> fizzBuzzContainer=new HashMap<>();
        fizzBuzzContainer.put(3,"Fizz");
        fizzBuzzContainer.put(5,"Buzz");
        fizzBuzzContainer.put(7,"Rizz");
        fizzBuzzContainer.put(11,"Jazz");

        for(int i=1;i<=100;i++){
            wordSaid="";
            k=0;
            for (Integer item : fizzBuzzContainer.keySet())
           {
               if(i%item.intValue()==0) {
                   wordSaid += (fizzBuzzContainer.get(item));
                   k++;
               }

           }
            if(k==0){
                k++;
                wordSaid+=i;}
        System.out.println(wordSaid);
    }
}}
