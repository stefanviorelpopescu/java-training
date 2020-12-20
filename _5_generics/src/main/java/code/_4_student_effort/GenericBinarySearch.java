package code._4_student_effort;
import java.util.Arrays;

public class GenericBinarySearch {
    public static <T extends Comparable<T>> void index( T[] items, T item )
    {
        int position = index( items, item, 0, items.length-1 );

        if(position >= 0)
            System.out.println("Element " + item + " found at position " + (position + 1));
        else
            System.out.println("Element " + item + " not found in sequence " + Arrays.toString(items));
    }

    static boolean isArrayAscSorted(Comparable[] items)
    {
        for (int i = 1; i < items.length ; i++) {
            if(items[i].compareTo(items[i-1]) < 0)
            {
                return false;
            }
        }
        return true;
    }

    static boolean isArrayDescSorted(Comparable[] items)
    {
        for (int i = 1; i < items.length ; i++) {
            if(items[i].compareTo(items[i-1]) > 0)
            {
                return false;
            }
        }
        return true;
    }

    public static <T extends Comparable<T>> int index( T[] items, T key, int low, int high )
    {
        if ( key == null)
            return -1;

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;
        if(isArrayAscSorted(items))
        {
            if (key.compareTo(items[mid]) > 0)
                return index(items, key, mid + 1, high);
            else if (key.compareTo(items[mid]) < 0)
                return index(items, key, low, mid - 1);
            else
                return mid;
        }
        else if (isArrayDescSorted(items))
        {
            if (key.compareTo(items[mid]) < 0)
                return index(items, key, mid + 1, high);
            else if (key.compareTo(items[mid]) > 0)
                return index(items, key, low, mid - 1);
            else
                return mid;
        }
        return 0;
    }

    public static void main(String[] args) throws ArrayNotSortedException {

        //3 arrays: int, string and double
        Integer[] items = { 22, 55, 66, 11, 32, 56, 67, 89, 95, 10 };
        String[] strItems = { "alk", "abc", "adk", "zyt", "fre", "nhy" };
        Double[] dItems = { 11.3, 13.3, 6.0, 9.6, 45.7, 23.2 };
        Integer[] descInt = {50, 40, 23, 20, 14, 6};
        String[] descStr = { "zzz", "yyy", "xxx", "bcd", "bcc", "bca" };
        //sort them, as later will show the exception for not sorted
        Arrays.sort(items);
        Arrays.sort(strItems);
        Arrays.sort(dItems);

        //check working for ascending sorted arrays
        if(!isArrayAscSorted(items) && !isArrayDescSorted(items))
            throw new ArrayNotSortedException("Array not sorted");

        if(!isArrayAscSorted(strItems) && !isArrayDescSorted(strItems))
            throw new ArrayNotSortedException("Array not sorted");

        if(!isArrayAscSorted(dItems) && !isArrayDescSorted(dItems))
            throw new ArrayNotSortedException("Array not sorted");

        index(items, Integer.valueOf(22));
        index(items, Integer.valueOf(11));
        index(items, Integer.valueOf(101));
        System.out.println("------------------------------------");

        index(strItems, "alk");
        index(strItems, "nhy");
        index(strItems, "null");
        System.out.println("------------------------------------");

        index(dItems, 13.3);
        index(dItems, 14.3);
        index(dItems, 23.0);
        System.out.println("------------------------------------");

        //check working for descending arrays
        if(!isArrayAscSorted(descInt) && !isArrayDescSorted(descInt))
            throw new ArrayNotSortedException("Array not sorted");

        if(!isArrayAscSorted(descStr) && !isArrayDescSorted(descStr))
            throw new ArrayNotSortedException("Array not sorted");


        Integer[] notSortedArray = {1, 12, 4, 5, 3, 18};
        String[] notSortedString = {"abc", "bcd", "abd"};

        index(descInt, Integer.valueOf(40));
        index(descInt, Integer.valueOf(20));
        index(descInt, Integer.valueOf(15));
        System.out.println("------------------------------------");

        index(descStr, "yyy");
        index(descStr, "bcc");
        index(descStr, "acb");
        System.out.println("------------------------------------");

        //Comment first if to check that the exception is thrown also for not sorted strings
//        if(!isArrayAscSorted(notSortedArray) && !isArrayDescSorted(notSortedArray))
//            throw new ArrayNotSortedException("Array not sorted");

        if(!isArrayAscSorted(notSortedString) && !isArrayDescSorted(notSortedString))
            throw new ArrayNotSortedException("Array not sorted");

    }
}

