package code._4_student_effort.fooBarQix;

public class FooBarQix {

    public static String compute(int n){
        String str="";
        String convert;
        boolean isDivisible = false;

        if((n%3)==0){
            str+="Foo";
            isDivisible=true;
        }
        if((n%5) ==0){
            str+="Bar";
            isDivisible=true;
        }
        if((n%7)==0){
            str+="Qix";
            isDivisible=true;
        }

        while(n>0){
            int number;
            number=n % 10;

            switch (number){
                case 3:
                   str+="Foo";
                   break;

                case 5:
                    str+="Bar";
                    break;
                case 7:
                   str+="Qix";
                   break;
                case 0:
                    str+="*";
                    break;
                default:
                    if(!isDivisible){
                    convert=String.valueOf(number);
                    str +=convert;
                    }
            }
        n=n/10;
        }

        return str;
    }

    public static void main(String[] args){

        System.out.println( compute(101));
        System.out.println( compute(303));
        System.out.println(compute(105));
        System.out.println(compute(10101));
    }
}
