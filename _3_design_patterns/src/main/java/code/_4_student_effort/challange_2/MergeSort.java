package code._4_student_effort.challange_2;

public class MergeSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        mergeSort(list,0,list.length-1);
    }

    private void mergeSort(Integer[] array, int low, int high){
        if(high <= low) return;

        int mid = (low+high)/2;
        mergeSort(array,low,mid);
        mergeSort(array, mid+1, high);
        merge(array, low, mid, high);
    }

    private void merge(Integer[] array, int low, int mid, int high){

        int leftArray[] = new int[mid-low+1];
        int rightArray[] = new int[high-mid];

        for(int i = 0; i < leftArray.length; i++)
            leftArray[i]=array[low + i];

        for(int i = 0; i < rightArray.length; i++)
            rightArray[i]=array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for(int i = low; i < high + 1; i++){
            if(leftIndex < leftArray.length && rightIndex < rightArray.length){
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < leftArray.length) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
