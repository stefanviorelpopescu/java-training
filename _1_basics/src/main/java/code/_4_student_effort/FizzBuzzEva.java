package code._4_student_effort;
 import java.util.Map;
 import java.util.HashMap;
public class FizzBuzzEva {

    private String convertNumber(int x,Map<Integer,String> map){

        String result = new String("");
        for(int i:map.keySet()){
            if(x%i==0)result=result.concat(map.get(i));
        }
        if(result.equals(""))result=result.concat(String.valueOf(x));
        return result;

    }

    public  String stage1(){
        Map<Integer,String> map=new HashMap();
        map.put(3,"Fizz");map.put(5,"Buzz");
        String result = new String("");
        for(int i=1;i<=100;i++){
           result=result.concat(convertNumber(i,map));
            if(i!=100)result=result.concat(", ");
        }
        return result;
    }
    public  String stage2(){
        String result = new String("");
        Map<Integer,String> map = new HashMap();
        map.put(3,"Fizz");map.put(5,"Buzz");map.put(7,"Rizz");map.put(11,"Jazz");
        for(int i=1;i<=100;i++){
            result = result.concat(convertNumber(i,map));
            if(i!=100)result=result.concat(", ");
        }
        return result;
    }

}
