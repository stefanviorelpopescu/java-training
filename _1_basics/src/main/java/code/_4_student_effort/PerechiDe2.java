package code._4_student_effort;

import java.util.Map;
import java.util.HashMap;

public class PerechiDe2 {
    int Perechi(int v[]){
        int k=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(v[0],1);
        int x;
        for(int i=1;i<v.length;i++){
            if(map.containsKey(-1*v[i]) && map.get(-1*v[i])>0){
                k++;
               x=map.get(-1*v[i])-1;
               map.put(-1*v[i],x);
            }
            else
                if(map.containsKey(v[i])){
                    x=map.get(v[i])+1;
                    map.put(v[i],x);
                }
                else map.put(v[i],1);
        }


        return k;
    }
}
