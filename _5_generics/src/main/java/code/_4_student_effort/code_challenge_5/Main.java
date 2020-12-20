package code._4_student_effort.code_challenge_5;

public class Main {
    public static void main(String[] args) throws ArrayNotSortedException {
        Integer[] list01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] list02 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] list03 = {10, 9, 8, 7, 5, 6, 4, 3, 2, 1};

        System.out.println(binarySearch(list01,8));
        System.out.println(binarySearch(list02,8));
        System.out.println(binarySearch(list03,8));

    }

    public static <T extends Comparable> int binarySearch(T[] array , T element) throws ArrayNotSortedException{

        int m,l = 0;
        int r = array.length-1;

        if(isAscSroted(array)) {
            while(l <= r){
                m = (l + r ) / 2;
                if(array[m].compareTo(element) == 0 ){
                    return m;
                }
                if (array[m].compareTo(element) < 0) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        } else if(isDscSroted(array)) {
            while (l <= r) {
                m = (l + r) / 2;
                if (array[m].compareTo(element) == 0) {
                    return m;
                }
                if (array[m].compareTo(element) < 0) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        } else {
            throw new ArrayNotSortedException("list is not sorted");
        }
        return -1;

    }
    public static <T extends Comparable> boolean isAscSroted(T[] array){
        for(int i = 0 ; i < array.length - 1 ; i++ ){
            if(array[i].compareTo(array[i+1])>0){
                return false;
            }
        }
        return true;
    }
    public static <T extends Comparable> boolean isDscSroted(T[] array){
        for(int i = 0 ; i < array.length - 1 ; i++ ){
            if(array[i].compareTo(array[i+1])<0){
                return false;
            }
        }
        return true;
    }


}
