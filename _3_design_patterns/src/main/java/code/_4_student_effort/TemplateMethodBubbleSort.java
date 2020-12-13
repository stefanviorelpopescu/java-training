package code._4_student_effort;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list){
        for(int i=0;i<list.length-1;i++){
            for(int j=i+1;j<list.length;j++){
                if(numebersIncorrectOrder(list[i],list[j])){
                    int aux;
                    aux=list[i];
                    list[i]=list[j];
                    list[j]=aux;
                }
            }
        }
    }
    abstract boolean numebersIncorrectOrder(Integer i1,Integer i2);
}
