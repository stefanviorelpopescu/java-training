package code._4_student_effort.challange2;

public class FooBarQix {
    public static String  compute(int number){
        String nr = Integer.valueOf(number).toString();

        String[] s = nr.split("");
        StringBuilder result = new StringBuilder();
        boolean flag = false;

        if(number % 3 == 0){
            result.append("Foo");
            flag = true;
        }

        if(number % 5 == 0){
            result.append("Bar");
            flag = true;
        }

        if(number % 7 == 0){
            result.append("Qix");
            flag = true;
        }

        for(String i: s){
            Integer digit = Integer.parseInt(i);
            if(digit == 0){
                result.append("*");
            }
            else if(digit == 3)
            {
                result.append("Foo");
            }
            else if(digit == 5)
            {
                result.append("Bar");
            }
            else if(digit == 7)
            {
                result.append("Qix");
            }
            else{
                if(!flag){
                    result.append(i);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(compute(303));
        System.out.println(compute(105));
        System.out.println(compute(10101));
    }
}
