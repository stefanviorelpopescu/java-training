package code._4_student_effort;

public class BubleSortStrategy implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        for(int i=0; i<list.length; i++){
            for(int j=i+1; j<list.length; j++)
                if(list[i] > list[j]){
                    int aux = list[i];
                    list[i] = list[j];
                    list[j] = aux;
                }
        }
    }
}
