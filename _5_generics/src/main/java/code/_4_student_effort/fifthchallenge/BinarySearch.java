package code._4_student_effort.fifthchallenge;

public class BinarySearch {

    private static <T extends Comparable<T>> Integer recursiveCrescatorBS(int left, int right, T[] arr, T key) {
        if (left > right)
            return null;

        int middle = (right - left) / 2 + left;
        if (arr[middle].compareTo(key) == 0)
            return middle;

        if (key.compareTo(arr[middle]) <= 0)
            return recursiveCrescatorBS(left, middle - 1, arr, key);
        else
            return recursiveCrescatorBS(middle + 1, right, arr, key);
    }

    private static <T extends Comparable<T>> Integer recursiveDescrescatorBS(int left, int right, T[] arr, T key) {
        if (left > right)
            return null;

        int middle = (right - left) / 2 + left;
        if (arr[middle].compareTo(key) == 0)
            return middle;

        if (key.compareTo(arr[middle]) >= 0)
            return recursiveDescrescatorBS(left, middle - 1, arr, key);
        else
            return recursiveDescrescatorBS(middle + 1, right, arr, key);
    }

    private static <T extends Comparable<T>> Boolean isSortedAscending(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0)
                return false;
        }
        return true;
    }

    private static <T extends Comparable<T>> Boolean isSortedDescending(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) < 0)
                return false;
        }
        return true;
    }

    /**
     * Searches for a given key within a sorted string
     * @param arr Array in which the search is performed
     * @param key the element that is searched within the array
     * @param <T> Generic type of array
     * @return Index of {@code key} in {@code arr},
     *         or <em>null</em> if key is not in {@code arr}
     *         (<strong>indexing starts from 1</strong>)
     * @throws ArrayNotSortedException if {@code arr} is not sorted,
     *          in neither ascending or descending order
     */
    public static <T extends Comparable<T>> Integer binarySearch(T[] arr, T key) throws ArrayNotSortedException {
        // check if is ordered in ascending or descending order
        Boolean isAscending = isSortedAscending(arr);
        Boolean isDescending = isSortedDescending(arr);

        if (!isAscending && !isDescending)
            throw new ArrayNotSortedException("Array is not sorted in neither ascending or descending order");

        Integer returnValue;
        if (isAscending)
            returnValue = recursiveCrescatorBS(0, arr.length - 1, arr, key);
        else
            returnValue = recursiveDescrescatorBS(0, arr.length - 1, arr, key);

        // if it is not null, increase by 1 (so indexing begins from 1)
        return returnValue == null ? null : returnValue + 1;
    }
}
