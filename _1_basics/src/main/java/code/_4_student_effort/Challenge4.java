package code._4_student_effort;

public class Challenge4 {

    public static void run(){
        int[] arr={3,-3,0,0,-3};
        int sum=0;
        int count=0;

        if(arr.length>=3){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k=j+1;k<arr.length;k++){
                        if((arr[i]+arr[j]+arr[k])==sum)
                            count++;
                    }
                }
            } //same as Challenge3, not completely correct
        }
        System.out.println(count);
    }
}
