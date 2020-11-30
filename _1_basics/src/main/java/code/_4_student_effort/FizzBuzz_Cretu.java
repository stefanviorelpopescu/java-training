package code._4_student_effort;
import java.util.HashMap;
import java.util.Map;



public class FizzBuzz_Cretu {
    public static void main(String[] args) {


        Map<Integer, String> hash_map = new HashMap<Integer, String>();

        hash_map.put(3, "Fizz");
        hash_map.put(5, "Buzz");
        hash_map.put(7, "Rizz");
        hash_map.put(11, "Jazz");
        for(Integer i=1;i<=100;i++) {
            boolean isdivisible = false;
            String s = "";
            for (Map.Entry<Integer, String> entry : hash_map.entrySet()) {
                if (i % entry.getKey() == 0) {
                    s += entry.getValue();
                    isdivisible = true;
                }
            }
            if (!isdivisible)
                s += i;
            System.out.println(s);
        }

    }
}


