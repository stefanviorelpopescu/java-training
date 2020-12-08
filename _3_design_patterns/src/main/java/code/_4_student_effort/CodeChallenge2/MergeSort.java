package code._4_student_effort.CodeChallenge2;

public class MergeSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {

        int right = list.length - 1;
        int left = 0;

        mergeSort(list, left, right);

    }

    public void mergeSort(Integer[] list, int left, int right){

        if( left < right) {

            int middle = (left + right) / 2;

            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);

            merge(list, left, middle, right);
        }
    }

    public void merge(Integer[] list, int left, int middle, int right){

        int size1 = middle - left + 1;
        int size2 = right - middle;

        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        for(int i = 0; i < size1; ++i){
            leftArray[i] = list[left + i];
        }

        for(int i = 0; i < size2; ++i){
            rightArray[i] = list[middle + i + 1];
        }

        int i = 0;
        int j = 0;

        int index = left;
        while(i < size1 && j < size2) {

            if(leftArray[i] <= rightArray[j]) {

                list[index] = leftArray[i];
                i++;
            }
            else {

                list[index] = rightArray[j];
                j++;
            }

            index++;
        }

        while(i < size1) {

            list[index] = leftArray[i];
            i++;
            index++;
        }

        while(j < size2) {

            list[index] = rightArray[j];
            j++;
            index++;
        }

    }

}
