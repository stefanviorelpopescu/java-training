package code._4_student_effort.challange_5;

public abstract class TemplateMethodBubleSort {

    void sort(Integer[] list) {
        boolean change = true;
        int x = list.length;
        while(change){
            change = false;
            for(int i=0; i<x-1; i++){
                if(numbersInCorrectOrder(list[i], list[i+1])){
                    change = true;
                    int a = list[i];
                    list[i] = list[i+1];
                    list[i+1] = a;
                }
            }
            x--;
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
