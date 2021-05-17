package code._4_student_effort;

import java.util.Scanner;

public class FooBarQix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input the max number: ");
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i++){
            System.out.println(compute(i));
        }
    }

    private static String compute(int i) {
        StringBuilder stringBuilder = new StringBuilder("");
        int copy = i;
        boolean printTheOriginalNumber = true;
        if(i%3 == 0) {
            stringBuilder.append("Foo");
            printTheOriginalNumber = false;
        } else if(i%5 == 0){
            stringBuilder.append("Bar");
            printTheOriginalNumber = false;
        }else if(i%7 == 0){
            stringBuilder.append("Qix");
            printTheOriginalNumber = false;
        }

        do{
            int lastDigit = copy % 10;
            if(lastDigit == 3) {
                stringBuilder.append("Foo");
                printTheOriginalNumber = false;
            } else if(lastDigit == 5){
                stringBuilder.append("Bar");
                printTheOriginalNumber = false;
            }else if(lastDigit == 7){
                stringBuilder.append("Qix");
                printTheOriginalNumber = false;
            }
            copy = copy/10;
        }
        while(copy != 0);

        if(printTheOriginalNumber == true){
            stringBuilder.append(i);
        }

        return stringBuilder.toString();
    }
}
