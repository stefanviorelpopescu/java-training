package code._4_student_effort._2_challenge;

public class BubbleSortStrategy implements SortingStrategy {

    public void swapWith(Integer[] list, int firstIndex, int secondIndex) {
        int aux = list[firstIndex];
        list[firstIndex] = list[secondIndex] ;
        list[secondIndex] = aux;
    }

    @Override
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    swapWith(list, i, j);
                }
            }
        }
    }
}
