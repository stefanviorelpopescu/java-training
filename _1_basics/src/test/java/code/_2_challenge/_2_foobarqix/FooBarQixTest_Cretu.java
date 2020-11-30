package code._2_challenge._2_foobarqix;

import static java.lang.Math.pow;

public class FooBarQixTest_Cretu {
    public static void main(String[] args) {
        int i,k=2,aux=0;

        for (i = 20; i < 100; i++) {
            boolean ok=false;
            if (i % 3 == 0) {
                System.out.print("Foo");
                ok=true;}
            if (i % 5 == 0){
                System.out.print("Bar");
                ok=true;}
            if (i % 7 == 0){
                System.out.print("Qix");
            ok=true;}
            else if(!ok)
                System.out.print(i+"=>");
            aux=i;
       while(aux!=0)
       {
           int digit=aux%10;
           if(digit==0)//protectie la 0
           {   aux/=10;
               continue;
           }
           {if (digit % 3 == 0)
               System.out.print("Foo");
           if (digit % 5 == 0)
               System.out.print("Bar");
           if (digit % 7 == 0)
               System.out.print("Qix");}
           aux/=10;
       }
            System.out.print("\n");
        }
    }
}

