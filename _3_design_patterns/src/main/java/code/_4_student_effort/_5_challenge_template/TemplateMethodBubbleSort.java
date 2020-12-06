package code._4_student_effort._5_challenge_template;

public abstract class TemplateMethodBubbleSort {
    public void swap(Integer[] list, int firstIndex, int secondIndex) {
        int aux = list[firstIndex];
        list[firstIndex] = list[secondIndex] ;
        list[secondIndex] = aux;
    }

    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1 ; i++){
            for ( int j = i+1; j < list.length; j++)
                if (numbersInCorrectOrder(list[i], list[j])) {
                    swap(list, i, j);
                }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
