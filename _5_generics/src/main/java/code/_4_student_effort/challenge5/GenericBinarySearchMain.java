package code._4_student_effort.challenge5;

public class GenericBinarySearchMain {
    public static void main(String[] args) throws ArrayNotSortedException {
        Integer[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] list2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer toBeSearched = 4;


        int direction = getSortingDirection(list2);

        if(arrayIsSorted(list2, direction)) {
            if(direction > 0) {
                System.out.println(binarySearchAscending(list, toBeSearched, 0, list.length - 1));
            }
            else if(direction < 0) {
                System.out.println(binarySearchDescending(list2, toBeSearched, list2.length - 1, 0));
            }
        }
    }

    private static <T extends Comparable> boolean binarySearchAscending(T[] list, T toBeSearched, int start, int end) {


        if(end >= start) {
            int mid = start + (end - start) / 2;
            if (toBeSearched.equals(list[mid-1])) {
                return true;
            }
            if (toBeSearched.compareTo(list[mid]) > 0) {
                return binarySearchAscending(list, toBeSearched, start, mid - 1);
            }

            return binarySearchAscending(list, toBeSearched, mid+1, end);
        }
        return false;
    }

    private static <T extends Comparable> boolean binarySearchDescending(T[] list, T toBeSearched, int start, int end) {
        if(end <= start) {
            int mid = start + (end - start) / 2;
            if (toBeSearched.equals(list[mid-1])) {
                return true;
            }
            if (toBeSearched.compareTo(list[mid]) < 0) {
                return binarySearchDescending(list, toBeSearched, start, mid - 1);
            }

            return binarySearchDescending(list, toBeSearched, mid+1, end);
        }
        return false;
    }


    public static <T extends Comparable> int getSortingDirection(T[] list) {
        int direction = 0, i = 0;
        while(direction == 0) {
            direction = list[i].compareTo(list[++i]);
        }
        return direction;
    }

    public static <T extends Comparable> boolean arrayIsSorted(T[] arr, int direction) throws ArrayNotSortedException {
        if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].compareTo(arr[i + 1]) != direction) {
                    throw new ArrayNotSortedException("List is not sorted!");
                }
            }
        }
        return true;
    }


}
