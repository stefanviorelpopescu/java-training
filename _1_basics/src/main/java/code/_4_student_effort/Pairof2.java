import java.util.HashMap;
public class Pairof2 {
    public static void main(String[] args) {
        int arr[] = new int[]{5, -5, 5, 5, 9, 7};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], 0);
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(hm.get(-arr[i]) != null && arr[i] != 0) {
                count++;
            }
        }
        System.out.print(count/2);
    }
}
