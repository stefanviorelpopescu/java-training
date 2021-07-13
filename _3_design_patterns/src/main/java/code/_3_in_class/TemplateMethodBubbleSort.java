package code._3_in_class;

public abstract class TemplateMethodBubbleSort {
    public void sort(Integer[] list) {
        int ok = 1, i;
        Integer aux;
        while (ok == 1) {
            ok = 0;
            for (i = 1; i < list.length; i++) {
                if (numbersInCorrectOrder(list[i], list[i - 1])) {
                    aux = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = aux;
                    ok = 1;
                }
            }
        }
    }
    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);

}
