package code._4_student_effort.generic_binary_search;

public class BinarySearch {
    public static void main (String[] args) throws ArrayNotSortedException {
        Integer[] arr = new Integer[]{20,19,18, 16,14,13,10,9,4,2};
        System.out.println(binarySearch(arr,9));

    }
    private static <T extends Comparable<T>> int binarySearch(T[] array,T val) throws ArrayNotSortedException {
        boolean lastDiff = array[0].compareTo(array[1])<0;
        for(int i=2;i<array.length;i++){
            if((array[i-1].compareTo(array[i])<0 && !lastDiff) || (array[i-1].compareTo(array[i])>0 && lastDiff)){
                throw new ArrayNotSortedException();
            }
        }
        System.out.println("Ascended sorted "  + lastDiff);

        return binarySearchHelper(array,val,0,array.length-1,lastDiff);
    }

    private static <T extends Comparable<T>> int binarySearchHelper(T[] array,T val,int a,int b,boolean asc) {
        if(a < 0 || b >= array.length){
            return -1;
        }
        int m = (a+b)/2;
        if(array [m].compareTo(val) ==0){
            return m;
        }

        if(a >= b){
            return -1;
        }

        if(array [m].compareTo(val)>0){
            if (!asc){
              return   binarySearchHelper(array,val,m+1,b,asc);
            }
            else{
                return   binarySearchHelper(array,val,a,m-1,asc);
            }
        } else{
            if (asc){
                return   binarySearchHelper(array,val,m+1,b,asc);
            }
            else{
                return   binarySearchHelper(array,val,a,m-1,asc);
            }
        }
    }


}
