package code._4_student_effort;

public abstract class TemplateMethodBubleSort {
    void sort(Integer[] list) {
        int len = list.length;
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (numbersInCorrectOrder(list[j], list[j+1])) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                }
            }
        }
    }
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
