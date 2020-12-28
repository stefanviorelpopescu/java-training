package code._4_student_effort;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZigZag {
    public static void main(String[] args) {

       List<Integer> input = new ArrayList<>(Arrays.asList(4,3,7,8,6,2,1));

       for(int i=0; i<input.size()-1; i++){
           checkPair(input,i);
       }
        input.stream().forEach(System.out::print);
    }

        private static void checkPair(List<Integer> input, int i) {
            if(!numbersInCorrectOrder(input,i)){
                Collections.swap(input,i,i+1);
                if(i>1){
                    checkPair(input,i-1);
                }
            }

        }

    private static boolean numbersInCorrectOrder(List<Integer> list, int position) {
        if(position % 2 == 0){
            return list.get(position) < list.get(position+1);
        }
        else {
            return  list.get(position) > list.get(position+1);
        }

    }

//        List<Integer> output = new ArrayList<>();
//
//        Collections.sort(input);
//        if(input.size()>2){
//            for(int i=2; i<input.size(); i+=2){
//                Collections.swap(input,i,i-1);
//            }
//        }
//        input.stream().forEach(System.out::print);


}



