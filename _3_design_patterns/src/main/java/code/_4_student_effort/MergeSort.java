package code._4_student_effort;

public class MergeSort implements SortingStrategy {
    public void sort(Integer[] list) {
        mergeSort(list, 0, list.length-1);
    }

    private void mergeSort(Integer[] list, int leftIdx, int rightIdx) { // time: O(NlogN)
        if (leftIdx >= rightIdx) return;

        // Calculate the index of middle element
        int halfIdx = (leftIdx + rightIdx) / 2;

        // Sort the two halves
        mergeSort(list, leftIdx, halfIdx);
        mergeSort(list, halfIdx + 1, rightIdx);

        // Merge the sorted halves
        merge(list, leftIdx, halfIdx, rightIdx);
    }

    private void merge(Integer[] list, int leftIdx, int halfIdx, int rightIdx) {
        // Create temporary arrays
        int leftList[] = new int[halfIdx - leftIdx + 1];
        int rightList[] = new int[rightIdx - halfIdx];

        // Copy data to the temporaty arrays
        for (int i = 0; i < leftList.length; i++) {
            leftList[i] = list[leftIdx + i];
        }

        for (int j = 0; j < rightList.length; j++) {
            rightList[j] = list[halfIdx + 1 + j];
        }

        // Merge the temporary arrays
        // Initialize indexes of first and second subarrays
        int i = 0;
        int j = 0;

        // Initialize index of merged subarry array
        int k = leftIdx;
        while (i < leftList.length && j < rightList.length) {
            if (leftList[i] <= rightList[j]) {
                list[k] = leftList[i];
                i++;
            } else {
                list[k] = rightList[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in leftList adn rightList, copy them
        while (i < leftList.length) {
            list[k] = leftList[i];
            i++;
            k++;
        }

        while (j < rightList.length) {
            list[k] = rightList[j];
            j++;
            k++;
        }
    }
}
