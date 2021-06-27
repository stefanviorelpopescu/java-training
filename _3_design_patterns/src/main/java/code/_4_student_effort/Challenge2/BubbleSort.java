package code._4_student_effort.Challenge2;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        for(int i=0; i<list.length-1; i++) {
            for(int j=i; i<list.length; j++) {
                if(list[i] < list[j]) {
                    Integer aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
            }
        }
    }
}
