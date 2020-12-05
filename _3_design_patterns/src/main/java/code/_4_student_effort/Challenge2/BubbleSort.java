package code._4_student_effort.Challenge2;

import code._4_student_effort.Challenge2.SortingStrategy;

public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {

        boolean done;
        do {
            done = true;

            for (int i=0;i<list.length-1;i++) {
                if (list[i] > list[i+1]) {
                    int aux = list[i];
                    list[i] = list[i+1];
                    list[i+1] = aux;
                    done = false;
                }
            }

        }while (done == false);
    }
}
