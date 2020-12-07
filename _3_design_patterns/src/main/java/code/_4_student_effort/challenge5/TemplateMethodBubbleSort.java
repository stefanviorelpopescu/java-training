package code._4_student_effort.challenge5;

public abstract class TemplateMethodBubbleSort {
    public void sort(Integer[] list) {
        int sem = 0;
        do {
            sem = 1;
            for (int i = 0; i < list.length - 1; ++i) {
                if (!numbersInCorrectOrder(list[i], list[i + 1])) {
                    int aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                    sem = 0;
                }
            }
        }while (sem == 0);
    }

    abstract boolean numbersInCorrectOrder(Integer I1, Integer I2);
}
