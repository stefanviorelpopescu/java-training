package code._4_student_effort;

public class GenericBinarySearch {

    public static void main(String[] args) {
        Integer[] fistArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] secondArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//        Integer[] thirdArray = {9, 6, 4, 1, 10, 2, 8, 3, 5, 7};
        System.out.println(appliedBinarySearch(fistArray, 10));
        System.out.println(appliedBinarySearch(fistArray, -2));
        System.out.println(appliedBinarySearch(secondArray, 10));
        System.out.println(appliedBinarySearch(secondArray, -2));
//        Example for exception throw.
//        System.out.println("");
//        System.out.println(appliedBinarySearch(thirdArray,2));
        System.out.println("");
        for (int i = 0; i <= 20; i++) {
            System.out.println(appliedBinarySearch(fistArray, i));
            System.out.println(appliedBinarySearch(secondArray, i));
        }
    }

    public static <T extends Comparable> boolean appliedBinarySearch(T[] array, T keyValue) {
        int sortingDirection = getSortingDirection(array);
        if (isSorted(array, sortingDirection)) {
            return binarySearch(array, keyValue, 0, array.length, sortingDirection);
        } else {
            return false;
        }
    }

    public static <T extends Comparable> boolean binarySearch(T[] array, T keyValue, int start, int end, int sortingDirection) {
        int middle = start + ((end - start) / 2);
        if (end < start) {
            return false;
        } else if (start == end) {
            return false;
        } else if (keyValue.equals(array[middle])) {
            return true;
        } else if (compareValuesForDirection(keyValue, array[middle], sortingDirection)) {
            return binarySearch(array, keyValue, start, middle, sortingDirection);
        } else {
            return binarySearch(array, keyValue, middle + 1, end, sortingDirection);
        }
    }

    public static <T extends Comparable> boolean compareValuesForDirection(T keyValue, T middleValue, int direction) {
        return Math.signum(keyValue.compareTo(middleValue)) == Math.signum(direction);
    }

    public static <T extends Comparable> int getSortingDirection(T[] array) {
        int direction = 0;
        for (int i = 0; i < array.length - 1; i++) {
            direction = array[i].compareTo(array[i + 1]);
            if (direction != 0) {
                break;
            }
        }
        return direction;
    }

    public static <T extends Comparable> boolean isSorted(T[] array, int sortingDirection) throws ArrayNotSortedException {
        if (array.length > 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) != sortingDirection) {
                    throw new ArrayNotSortedException("Array is not sorted.");
                }
            }
        }
        return true;
    }

}
