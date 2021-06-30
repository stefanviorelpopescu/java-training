package code._4_student_effort.strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] array) {
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}

