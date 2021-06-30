package code._4_student_effort.template_method;

public abstract class TemplateBubbleSort {
    void sort(Integer[] list) {
        boolean check;

        do {
            check = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (!numbersInCorrectOrder(list[i], list[i + 1])) {
                    int aux = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = aux;
                    check = numbersInCorrectOrder(list[i], list[i + 1]);
                }
            }
        } while (check);
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
