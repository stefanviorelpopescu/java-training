package code._4_student_effort;

import java.util.HashMap;

public class CodeChallengeTwo {

    String compute(int number)
    {
        HashMap<Integer,String> fooBarQixxContainter=new HashMap<>();
        fooBarQixxContainter.put(3,"Foo");
        fooBarQixxContainter.put(5,"Bar");
        fooBarQixxContainter.put(7,"Qix");
        String formatedString="";
        char[] digits = String.valueOf(number).toCharArray();
        for(Integer item:fooBarQixxContainter.keySet()) {
            if (number % item == 0) {
                formatedString += fooBarQixxContainter.get(item);
            }
        }
        for(char digit:digits)
            for(Integer item:fooBarQixxContainter.keySet())
                if(Character.getNumericValue(digit)==item)
                    formatedString+=fooBarQixxContainter.get(item);
        if(formatedString.isBlank())
            return ""+number;
    return formatedString;
    }

    String compute2(int number){
        Boolean divide=false;
        HashMap<Integer,String> fooBarQixxContainter=new HashMap<>();
        fooBarQixxContainter.put(3,"Foo");
        fooBarQixxContainter.put(5,"Bar");
        fooBarQixxContainter.put(7,"Qix");
        String formatedString="";
        char[] digits = String.valueOf(number).toCharArray();
        for(Integer item:fooBarQixxContainter.keySet()) {
            if (number % item == 0) {
                formatedString += fooBarQixxContainter.get(item);
                divide=true;
            }
        }
        fooBarQixxContainter.put(0,"*");
        for(char digit:digits) {
            for (Integer item : fooBarQixxContainter.keySet())
                if (Character.getNumericValue(digit) == item)
                    formatedString += fooBarQixxContainter.get(item);
            if (!divide&&Character.getNumericValue(digit)!=0)
                formatedString += digit;
        }
        if(formatedString.isBlank())
            return ""+number;
        return formatedString;
    }
}
