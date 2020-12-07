package code._4_student_effort;

public abstract class TemplateMethodBubbleSort {
    public abstract boolean numbersInCorrectOrder(int i1, int i2);
    void sort(Integer []list){
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (numbersInCorrectOrder(list[i], list[j])) {
                    Integer temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
