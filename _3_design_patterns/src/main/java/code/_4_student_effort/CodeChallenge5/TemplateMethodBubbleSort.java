package code._4_student_effort.CodeChallenge5;

public abstract class TemplateMethodBubbleSort {

    public void sort(Integer[] list) {

        boolean isSorted;
        int temp;

        do {
            isSorted = true;
            for(int i = 0; i < list.length - 1; i++) {
                if(!numbersInCorrectOrder(list[i], list[i + 1] )) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    isSorted = false;
                }
            }
        } while(!isSorted);
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
