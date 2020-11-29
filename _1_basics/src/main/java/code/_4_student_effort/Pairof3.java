import java.util.Arrays;
import java.util.HashMap;

public class Pairof3 {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = new int[]{3, 2, 9, -1, -8, 7, -7, -2, 0, 0, -2};
        boolean arrindex[] = new boolean[11];
        int n = arr.length;


        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            s.put(arr[i], i);
            arrindex[i] = false;
        }
        for(int i  = 0; i < arr.length - 1; ++i){
            for(int j = i + 1; j < arr.length; ++j){
                if(s.get(-(arr[i] + arr[j])) != null && arrindex[i] == false && arrindex[j] == false && arrindex[s.get(-(arr[i] + arr[j]))] == false ) {
                    count++;
                    arrindex[i] = true;
                    arrindex[j] = true;
                    arrindex[s.get(-(arr[i] + arr[j]))] = true;
                }
            }
        }


        System.out.print(count);
    }
}
