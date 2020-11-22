package code._4_student_effort.pairOf3;

public class PairOf3 {

    public static void initialize(int[] arr){
        for(int i=0;i<arr.length;i++)
            arr[i]=0;
    }

    public static int pairOf3(int[] n){
        int nr=0;
        int[] check=new int[10];
        initialize(check);

        for(int i=0;i<n.length-2;i++) {
            for (int j = i+1; j <n.length-1 ; j++) {
                for(int k=j+1;k<n.length;k++)
                if ((n[i] + n[j] + n[k]) == 0 &&  check[i]==0 && check[j]==0 && check[k]==0) {
                    nr++;
                    check[i]=1;
                    check[j]=1;
                    check[k]=1;
                }
            }

        }



        return nr;
    }

    public static void main(String[] args){
        int[] numbers={-1,-1,-1,2};
        System.out.println(pairOf3(numbers));
    }
}
