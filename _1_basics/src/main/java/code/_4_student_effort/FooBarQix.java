package code._4_student_effort;

import com.sun.jdi.Value;

public class FooBarQix {
    static public String compute(int i)
    {
        String output="";
        if(i%3==0){
            output +="Foo";
        }
        if(i%5==0){
            output +="Bar";
        }
        if(i%7==0)
        {
            output +="Qix";
        }

        char[] digits = String.valueOf(i).toCharArray();
        for(char digit: digits){
            if(digit=='3'){
                output +="Foo";
            }else if(digit == '5'){
                output +="Bar";
            }else if(digit == '7'){
                output +="Qix";
            }
        }
        if(output.equals("")){
            output += String.valueOf(i);
        }
        return output;
    }
    static public String stage1(int n){
        String output ="";
        for(int i =1;i<=n;i++){
            output+="\n"+i+" => "+compute(i);
        }
        output+=compute(n);
        return output;
    }
    static public String compute2(int i)
    {
        String output="";
        boolean divided=false;
        if(i%3==0){
            output +="Foo";
            divided=true;
        }
        if(i%5==0){
            output +="Bar";
            divided=true;
        }
        if(i%7==0)
        {
            output +="Qix";
            divided=true;
        }

        char[] digits = String.valueOf(i).toCharArray();
        for(char digit: digits){
            if(digit=='3'){
                output +="Foo";
            }else if(digit == '5'){
                output +="Bar";
            }else if(digit == '7'){
                output +="Qix";
            }else if(digit == '0'){
                output +="*";
            }else if(!divided){
                output += digit;
            }
        }
        if(output.equals("")){
            output += String.valueOf(i);
        }
        return output;
    }
    static public String stage2(int n){
        String output ="";
        for(int i =1;i<n;i++){
            output+="\n"+i+" => "+compute2(i);
        }
        output+="\n"+n+" => "+compute2(n);
        return output;
    }
}
