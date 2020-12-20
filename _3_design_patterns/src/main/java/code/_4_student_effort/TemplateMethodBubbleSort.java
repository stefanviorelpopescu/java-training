package code._4_student_effort;

    public abstract class TemplateMethodBubbleSort {
        void sort(Integer[] list){
            for(int i=0;i<list.length-1;i++){
                for(int j=i+1;j<list.length;j++){
                    if(!numberInCorrectOrder(list[i],list[j])){
                        int aux=list[i];
                        list[i]=list[j];
                        list[j]=aux;
                    }
                }
            }
        }



        public boolean numberInCorrectOrder(int x,int y){
            return true;
        }
    }

