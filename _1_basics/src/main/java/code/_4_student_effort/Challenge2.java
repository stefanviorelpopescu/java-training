package code._4_student_effort;

public class Challenge2 {
    static void FooBarQix() {
        System.out.print("#############  Start Challenge #2   ############# \n");
        System.out.print(Challenge2.compute2(101));
        System.out.print(Challenge2.compute2(303));
        System.out.print(Challenge2.compute2(105));
        System.out.print(Challenge2.compute2(10101));
        System.out.print("#############  End Challenge #2   ############# \n");
    }

    static String compute(int num) {
        String msg = "";

        if(num % 3 == 0) {
            msg += "Foo";
        } else if (num % 5 == 0) {
            msg += "Bar";
        } else if (num % 7 == 0) {
            msg += "Qix";
        } else {
            msg += num;
        }

        String newMsg = checkDigit(num);
        return msg + newMsg;
    }

    private static String checkDigit(int num) {
        String str = "";

        while (num > 0) {
            if(num % 10== 3) {
                str += "Foo";
                num = num / 10;
            }
            else if(num % 10== 5) {
                str += "Bar";
                num = num / 10;
            }
            else if(num % 10== 7) {
                str += "Qix";
                num = num / 10;
            }
            else {
                num = num / 10;
            }
        }

        return str;
    }

    static String compute2(int num) {
        String str = "";
        boolean diviz = false;

        if (num % 3 == 0) {
            str += "Foo";
            diviz = true;
        }
        if (num % 5 == 0) {
            str += "Bar";
            diviz = true;
        }
        if (num % 7 == 0) {
            str += "Qix";
            diviz = true;
        }

        char[] digits = String.valueOf(num).toCharArray();
        for (char digit : digits) {

            if (digit == '0') {
                str += "*";
            }
            else if (digit == '3') {
                str += "Foo";
            }
            else if (digit == '5') {
                str += "Bar";
            }
            else if (digit == '7') {
                str += "Qix";
            }
            else if (!diviz) {
                str += digit;
            }
        }

        return String.valueOf(num) + " => " + str + "\n";
    }
}
