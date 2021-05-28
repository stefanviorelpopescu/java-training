package code._4_student_effort.challange_2;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        boolean change = true;
        int x = list.length;
        while(change){
            change = false;
            for(int i=0; i<x-1; i++){
                if(list[i]>list[i+1]){
                    change = true;
                    int a = list[i];
                    list[i] = list[i+1];
                    list[i+1] = a;
                }
            }
            x--;
        }
    }
}
