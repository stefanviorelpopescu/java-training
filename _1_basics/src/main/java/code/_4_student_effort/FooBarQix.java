package code._4_student_effort;

import static java.lang.StrictMath.pow;

public class FooBarQix {

    public static String compute(int number){
        String word = "";
        if(number%3 == 0){
            word += "Foo";
        }
        if(number%5 == 0){
            word += "Bar";
        }
        if(number%7 == 0){
            word += "Qix";
        }
        int coppy = number;

        int lastDigit;
        while(coppy != 0){
            lastDigit = coppy%10;
            switch (lastDigit){
                case 3: {
                    word += "Foo";
                    break;
                }
                case 5: {
                    word += "Bar";
                    break;
                }
                case 7: {
                    word += "Qix";
                    break;
                }
            }
            coppy /= 10;
        }
        if(word.isEmpty()){
            word = String.valueOf(number);
        }
        return word;
    }

    public static String compute2(int number){
        String word = "";
        if(number%3 == 0){
            word += "Foo";
        }
        if(number%5 == 0){
            word += "Bar";
        }
        if(number%7 == 0){
            word += "Qix";
        }

        int coppy = number;
        boolean lastDigit0 = false;
        if(coppy%10 == 0){
            lastDigit0 = true;
        }

        int power = 10;
        int revertedNumber = 0;
        while(coppy != 0){
            revertedNumber *= power;
            revertedNumber += coppy%10;
            coppy /= 10;
        }
        System.out.println(revertedNumber);
        int lastDigit;
        while(revertedNumber != 0){
            lastDigit = revertedNumber%10;
            switch (lastDigit){
                case 0: {
                    word += "*";
                    break;
                }
                case 3: {
                    word += "Foo";
                    break;
                }
                case 5: {
                    word += "Bar";
                    break;
                }
                case 7: {
                    word += "Qix";
                    break;
                }
            }
            revertedNumber /= 10;
        }
        if(lastDigit0){
            word += "*";
        }
        else {
            if (word.isEmpty()) {
                word = String.valueOf(number);
            }
        }
        return word;
    }
}
