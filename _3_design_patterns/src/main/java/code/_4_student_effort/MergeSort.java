package code._4_student_effort;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{
    public void sort(Integer[] list){
        if(list.length >= 2) {
            Integer splitIndex = list.length / 2;
            Integer[] leftList = Arrays.copyOfRange(list, 0, splitIndex);
            Integer[] rightList = Arrays.copyOfRange(list, splitIndex, list.length);

            sort(leftList);
            sort(rightList);
            merge(list, leftList, rightList);
        }
    }
    private void merge(Integer[] list,Integer[] leftList,Integer[] rightList){
        Integer leftIndex = 0;
        Integer rightIndex = 0;
        Integer listIndex = 0;

        while (leftIndex<leftList.length && rightIndex<rightList.length){
            if(leftList[leftIndex].compareTo(rightList[rightIndex]) < 0){
                list[listIndex] = leftList[leftIndex];
                leftIndex++;
            }else{
                list[listIndex] = rightList[rightIndex];
                rightIndex++;
            }
            listIndex++;
        }
        while (leftIndex<leftList.length){
            list[listIndex] = leftList[leftIndex];
            leftIndex++;
            listIndex++;
        }
        while (rightIndex<rightList.length){
            list[listIndex] = rightList[rightIndex];
            rightIndex++;
            listIndex++;
        }
    }
}
