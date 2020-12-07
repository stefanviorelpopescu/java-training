package code._4_student_effort.challenge5;

public abstract class TemplateMethodBubbleSort {

    public void sort(Integer[] arr) {
        int len = arr.length;
        for (int i = 0; i < len-1; i++)
            for (int j = 0; j < len-i-1; j++)
                if (numbersInCorrectOrder(arr[j], arr[j+1]))
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
