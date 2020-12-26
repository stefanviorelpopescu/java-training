package code._4_student_effort.CodeChallenge5;


public class GenericBinarySearch {

    public static <T extends Comparable> boolean binarySearch(T[] list, T value, int direction, int start, int end) throws ArrayNotSortedException {
        if (isSorted(list, direction)) {
            int middle = start + (end - start) / 2;
            if (value.equals(list[middle])) {
                return true;
            } else if (end == start) {
                return false;
            } else if (value.compareTo(list[middle]) < 0) {
                return binarySearch(list, value, direction, start, middle);
            } else {
                return binarySearch(list, value, direction, middle + 1, end);
            }
        } else {
            return false;
        }
    }

    public static <T extends Comparable> boolean isSorted(T[] list, int direction) throws ArrayNotSortedException {

        if (list.length > 1) {
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i].compareTo(list[i + 1]) > 0 && direction == 1) {
                    throw new ArrayNotSortedException("list is not sorted ascending!");
                } else if (list[i].compareTo(list[i + 1]) < 0 && direction == 0) {
                    throw new ArrayNotSortedException("list is not sorted descending!");
                }
            }
        }
        return true;
    }

}
