package code._4_student_effort.Challenge2;

public class MergeSort implements SortingStrategy{

    public void sort(Integer[] list)
    {
        int n = list.length;

        if(n<2)
        {
            return;
        }

        int mij= n/2;
        Integer[] l = new Integer[mij];
        Integer[] r = new Integer[n-mij];

        for(int i=0; i< mij; i++)
        {
            l[i] = list[i];
        }

        for(int i=mij; i< n; i++)
        {
            r[i-mij] = list[i];
        }

        sort(l);
        sort(r);

        merge(list,l,r,mij,n-mij);



    }

    public static void merge(Integer[] arr, Integer[] l, Integer[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }


}
