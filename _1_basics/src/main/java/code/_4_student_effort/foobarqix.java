package code._4_student_effort;
import java.util.*;

public class foobarqix {
    public static String compute(int i){
        String S = "";
        if (i % 3 == 0)
            S = S + "Foo";
        if (i % 5 == 0)
            S = S + "Bar";
        if (i % 7 == 0)
            S = S + "Qix";
        char[] IString = Integer.toString(Integer.valueOf(i)).toCharArray();
        for (char x : IString){
            if (x == '3')
                S = S + "Foo";
            if (x == '5')
                S = S + "Bar";
            if (x == '7')
                S = S + "Qix";
        }

        if (S == "")
            return Integer.toString(Integer.valueOf(i));
        return S;
    }


    public static String compute2(int i){
        boolean is = false;
        String S = "";
        if (i % 3 == 0)
            S = S + "Foo";
        if (i % 5 == 0)
            S = S + "Bar";
        if (i % 7 == 0)
            S = S + "Qix";
        char[] IString = Integer.toString(Integer.valueOf(i)).toCharArray();
        for (char x : IString){
            if (x == '3'){
                S = S + "Foo";
                is = true;
            }
                
            if (x == '5'){
                S = S + "Bar";
                is = true;
            }
               
            if (x == '7'){
                S = S + "Qix";
                is = true;
            }
               
            if (x == '0')
                S = S + '*';
        }
        if (is == false)
            S = Integer.toString(i).replace("0", "*");
        else if (S == ""){
            S =  Integer.toString(Integer.valueOf(i));
            S.replace('0', '*');
        }
            
        return S;
    }
}
