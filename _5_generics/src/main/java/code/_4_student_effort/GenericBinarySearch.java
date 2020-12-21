package code._4_student_effort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class GenericBinarySearch{

    private int midPoint(int iMin, int iMax){
        return iMin + (iMax - iMin)/2;
    }

    public <T> int search(List<T> list, T Key, int iMin, int iMax, Comparator<T> comparator){
        if(list == null || list.size() == 0){
            return -1;
        }
        int iMid = midPoint(iMin, iMax);
        if(iMid > iMax || iMid < iMin){
            return -1;
        }
        if(comparator.compare(list.get(iMid), Key) > 0){
            return search(list, Key, iMin, iMid-1, comparator);
        }else if(comparator.compare(list.get(iMid), Key) < 0){
            return search(list, Key, iMid+1, iMax, comparator);
        }else{
            return iMid;
        }
    }
}
