package code._4_student_effort.CodeChallenge2;

public class BubbleSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {

        int temp;
        boolean isSorted;

        do{

            isSorted = true;

            for(int i = 0; i < list.length - 1; i++){

                if(list[i] > list[i+1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted);
    }
}
