package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;


public class FooBarQixEva {

    boolean conditieZero(int x){
        boolean ok = false;

        while(x>0){
            if(x%10==0)ok=true;
            x/=10;
        }
        return ok;
    }
    boolean conditieMap(int x,Map<Integer,String> map){
        boolean ok = false;
        for(int i:map.keySet()){
            if(x%i==0)ok=true;
        }
        while(x>0){

            for(int i:map.keySet()){
                if(i==x%10)ok=true;
            }
            x/=10;
        }
        return ok;
    }

    String compute2(int x){
        Map<Integer,String> map = new HashMap();
        String result = new String("");
        map.put(3,"Foo");map.put(5,"Bar");map.put(7,"Qix");
        for(int i:map.keySet()){
            if(x%i==0)result=result.concat(map.get(i));
        }
        int aux=0;
        int clona=x;
        while(clona>0){
            aux=aux*10+clona%10;
            clona/=10;
        }
        while(aux>0){
            if(aux%10==0)result=result.concat("*");
            for(int i:map.keySet()){
                if(aux%10==i)result=result.concat(map.get(i));
            }
            aux/=10;
        }

        if(result.equals(""))result.concat(String.valueOf(x));
        if(conditieMap(x,map)==false && conditieZero(x)==true){
            result = "";
            while(x>0){
                if(x%10==0)result = "*"+result;
                else
                    result = String.valueOf(x%10) + result;
                x/=10;
            }

        }
        return result;
    }

    String compute(int x){
     Map<Integer,String> map = new HashMap();
     String result = new String("");
     map.put(3,"Foo");map.put(5,"Bar");map.put(7,"Qix");
     for(int i:map.keySet()){
         if(x%i==0)result=result.concat(map.get(i));
     }
     int aux=0;
     int clona=x;
     while(clona>0){
         aux=aux*10+clona%10;
         clona/=10;
     }
     while(aux>0){
         for(int i:map.keySet()){
             if(aux%10==i)result=result.concat(map.get(i));

         }
         aux/=10;
     }
     if(result.equals(""))result.concat(String.valueOf(x));

     return result;
    }
}
