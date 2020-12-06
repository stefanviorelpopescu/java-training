package code._4_student_effort.Code_Challenge_5;

public abstract class TemplateMethodBubbleSort {

    public void sort(Integer[] list){

        int length = list.length;
        for (int i = 0; i < length - 1; i++) {

            for (int j = 0; j < length - i - 1; j++) {

                if (inCorrectOrder(list[j], list[j+1])) {

                    Integer temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                }
            }
        }

    }

    abstract boolean inCorrectOrder(Integer i1 , Integer i2);

}
