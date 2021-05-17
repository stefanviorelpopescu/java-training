package code._4_student_effort;

public class Challenge2 {

    public static void compute1(int n){
        String x=new String();
        if(n%3==0)
            x=x+"Foo";
        if(n%5==0)
             x=x+"Bar";
        if(n%7==0)
             x=x+"Qix";


        while(n>0){
            int first_digit = Integer.parseInt(Integer.toString(n).substring(0, 1));
            if(first_digit==3)
                x=x+"Foo";
            if(first_digit==5)
                x=x+"Bar";
            if(first_digit==7)
                x=x+"Qix";
            n %= (int) Math.pow(10, (int) Math.log10(n));
         }
        System.out.print(x);

    }
    public static void compute2(int n){
        String x=new String();
        if(n%3==0)
            x=x+"Foo";
        else if(n%5==0)
            x=x+"Bar";
        else if(n%7==0)
            x=x+"Qix";
        else x=x+n;
        int n_prim=n;
        while(n_prim>0){
            if(n_prim%10==0)
                x=x+"*";
            n_prim/=10;
        }
        while(n>0){
            int first_digit = Integer.parseInt(Integer.toString(n).substring(0, 1));
            if(first_digit==3)
                x=x+"Foo";
            if(first_digit==5)
                x=x+"Bar";
            if(first_digit==7)
                x=x+"Qix";
            n %= (int) Math.pow(10, (int) Math.log10(n));
        }
        System.out.print(x);
    }
}
