package code._4_student_effort._5_challenge;

public abstract class TemplateMethodBubbleSort {
    public void swapWith(Integer[] list, int first, int second) {
        int aux = list[first];
        list[first] = list[second] ;
        list[second] = aux;
    }

    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1 ; i++) {
            for ( int j = i + 1; j < list.length; j++) {
                if (numbersInCorrectOrder(list[i], list[j])) {
                    swapWith(list, i, j);
                }
            }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
