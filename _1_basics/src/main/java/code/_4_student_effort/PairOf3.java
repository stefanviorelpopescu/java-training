package code._4_student_effort;

import java.util.ArrayList;
import java.util.Scanner;

public class PairOf3 {

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

    private static int computePairs(ArrayList<Integer> arrayList){
        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(arrayList);

        int numberOfPairs = 0;
        for(int i = 0; i < arrayList.size() - 2; i++){
            for(int j = i; j < arrayList.size() - 1; j++){
                int sum = arrayList.get(i)+arrayList.get(j);
                if(copyList.contains(-sum)){
                    int index = copyList.indexOf(-sum);
                    numberOfPairs++;
                    copyList.remove(index);
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
