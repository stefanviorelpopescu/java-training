package code._4_student_effort;

import code._2_challenge._5_generic_binary_search.ArrayNotSortedException;

public class GenericBinarySearch {
    public static void main(String[] args) {
        GenericBinarySearch ob = new GenericBinarySearch();
        int array[] = { 2, 3, 4, 10, 40 };
        int array1[] = { 40, 10, 4, 2, 3 };
        int n = array.length;
        int element_to_search = 10;
        int result = ob.binarySearch(array, 0, n - 1, element_to_search);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

    protected static int binarySearch(int array[], int left, int right, int index)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // If the element is present at the
            // middle itself
            if (array[mid] == index)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (array[mid] > index)
                return binarySearch(array, left, mid - 1, index);

            // Else the element can only be present
            // in right subarray
            return binarySearch(array, mid + 1, right, index);
        }

        // If the element is not present
        // in array
        return -1;
    }

    public static <T extends Comparable> int getSortingDirection(T[] list) {
        int direction = 0;
        for (int i = 0; i < list.length - 1; i++) {
            direction = list[i].compareTo(list[i + 1]);
            if (direction != 0) break;
        }
        return direction;
    }

    public static <T extends Comparable> boolean isSorted(T[] list, int direction) throws code._2_challenge._5_generic_binary_search.ArrayNotSortedException {
        if (list.length > 1) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].compareTo(list[i + 1]) != direction) {
                    throw new ArrayNotSortedException("list is not sorted!");
                }
            }
        }
        return true;
    }
}
