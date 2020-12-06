package _4_student_effort.second_challenge;

public class BubleSort implements SortingStrategy {


    @Override
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length; i++)
            for (int j = i + 1; j < list.length; j++)
                if (list[j] < list[i]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
    }
}
