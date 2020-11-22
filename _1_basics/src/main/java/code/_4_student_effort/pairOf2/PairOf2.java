package code._4_student_effort.pairOf2;

public class PairOf2 {

    public static void initialize(int[] arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=0;
    }

    public static int pairOf2(int[] n){
        int nr=0;
        int[] check=new int[10];

        initialize(check);

        for(int i=0;i<n.length-1;i++) {
            for (int j = i+1; j <n.length ; j++) {
                if ((n[i] + n[j]) == 0 &&  check[i]==0 && check[j]==0) {
                    nr++;
                   check[i]=1;
                   check[j]=1;
                }
            }

        }
        return nr;
    }

    public static void main(String[] args){

        int[] numbers1={3,2,-3,-2,3,0};
        int[] numbers2={1,1,0,-1,-1};
        int[] numbers3={5,9,-5,7,-5};

        System.out.println(pairOf2(numbers1));
        System.out.println(pairOf2(numbers2));
        System.out.println(pairOf2(numbers3));

    }
}
