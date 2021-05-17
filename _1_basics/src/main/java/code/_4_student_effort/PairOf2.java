package code._4_student_effort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PairOf2 {
    private static ArrayList<Integer> readData(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the array: ");
        int length = scanner.nextInt();
        System.out.println("Input elements of the array");
        for(int i = 0; i < length; i++){
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }

    /**
     *
     * @param arrayList
     * @return numberOfPairs
     *
     * This method sorts the array of numbers and considers an index at the beginning and end of array.
     * The elements at those two indexes are summed constantly to check for our property. If the sum is 0, we advance towards the
     * middle of the array with both of them, else only with the index of the bigger absolute value.
     * The frontIndex should represent negative numbers, while the endIndex only positive ones.
     */
    private static int computePairs(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        int numberOfPairs = 0;
        int frontIndex = 0;
        int endIndex = arrayList.size() - 1;
        while(frontIndex != endIndex && arrayList.get(frontIndex) < 0 && arrayList.get(endIndex) > 0){
            if(arrayList.get(frontIndex) + arrayList.get(endIndex) == 0){
                numberOfPairs++;
                frontIndex++;
                endIndex--;
            }
            else{
                if(Math.abs(arrayList.get(frontIndex)) > Math.abs(arrayList.get(endIndex))){
                    frontIndex++;
                }
                else{
                    endIndex--;
                }
            }
        }
        return numberOfPairs;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = readData();
        int numberOfPairs = computePairs(arrayList);
        System.out.println(numberOfPairs);
    }
}
