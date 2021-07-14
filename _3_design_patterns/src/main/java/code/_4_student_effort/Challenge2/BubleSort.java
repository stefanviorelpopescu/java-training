package code._4_student_effort.Challenge2;

public class BubleSort implements SortingStrategy {
    public Integer[] list;

    public BubleSort()
    {}

    public void sort(Integer[] list)
    {
        this.list= list;
        int n = list.length;
        for(int i=0 ; i< n-1 ; i++)
            for(int j=0 ; j< n-i-1; j++)
            {
                if(list[j] > list[j+1])
                {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] =temp;
                }
            }
    }

}
