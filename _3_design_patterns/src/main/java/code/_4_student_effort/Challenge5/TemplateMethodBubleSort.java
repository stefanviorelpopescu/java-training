package code._4_student_effort.Challenge5;

public abstract class TemplateMethodBubleSort {

    public void sort(Integer[] list) {
        boolean done;

        do {
            done=true;
            for (int i=0;i<list.length-1;i++) {
                if (!numbersInCorrectOder(list[i],list[i+1])) {
                    int aux = list[i];
                    list[i] = list[i+1];
                    list[i+1] = aux;
                    done=false;
                }
            }
        }while(!done);
    }

    abstract boolean numbersInCorrectOder(Integer i1, Integer i2);
}
