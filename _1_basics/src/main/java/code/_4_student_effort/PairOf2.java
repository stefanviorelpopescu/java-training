package code._4_student_effort;

public class PairOf2 {
    public static void main(String[] args) {
        Integer numberOfPairs = 0;
        Integer[] numbers = {3, 2, 7, -2, 5, -3, 4, -7};
        boolean[] numberUsed = new boolean[numbers.length];





        for (int i = 0; i < numbers.length - 1; i ++)
            for (int j = i+1 ; j < numbers.length ; j++)
                if (numbers[i] + numbers[j] == 0)
                {
                    System.out.println(numbers[i] +  " + " + numbers[j] + " = 0");
                    if (!numberUsed[i] && !numberUsed[j]) {
                        numberUsed[i] = true;
                        numberUsed[j] = true;
                        numberOfPairs++;
                    }
                }
        System.out.println("Numarul de perechi din array este " + numberOfPairs);
    }
}
