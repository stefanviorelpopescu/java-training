package code._4_student_effort._2_challenge;

public class MergeSortStrategy implements SortingStrategy {

    public static void mergeSort(Integer[] arr, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }

        int mid = arrayLength / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[arrayLength - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        if (arrayLength - mid >= 0) {
            System.arraycopy(arr, mid, right, 0, arrayLength - mid);
        }

        mergeSort(left, mid);
        mergeSort(right, arrayLength - mid);

        merge(arr, left, right, mid, arrayLength - mid);
    }


    public static void merge(Integer[] arr, Integer[] leftArray, Integer[] rightArray, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            arr[k++] = leftArray[i++];
        }
        while (j < right) {
            arr[k++] = rightArray[j++];
        }
    }

    @Override
    public void sort(Integer[] list) {
        // another sorting strategy that is already implemented would be:
        // Arrays.sort(list);
        mergeSort(list, list.length);
    }
}
