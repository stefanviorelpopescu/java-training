package code._4_student_effort;
//CodeChallenge1
public class Leaders {
    void printLeaders(int arr[], int size)
    {
        int max_from_right =  arr[size-1];

        System.out.print(max_from_right + " ");

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right <= arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }
}
