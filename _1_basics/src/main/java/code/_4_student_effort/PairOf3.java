package code._4_student_effort;

public class PairOf3 {
    public static void main(String[] args) {
        int numberOfPairs = 0;
        Integer[] numbers = {3, 6, 8, 9, 1, 2, 5, -3, -2, -6, -1, -1, -2, 4, -2, 6, 3, -3, -1, -3, 2, 2};

        boolean[] numberUsed = new boolean[numbers.length];

        for (int i = 0; i < numbers.length - 2; i++)
            for (int j = i + 1; j < numbers.length - 1; j++)
                for (int k = j + 1; k < numbers.length; k++)
                    if (numbers[i] + numbers[j] + numbers[k] == 0)
                    {
                        if (!numberUsed[i] && !numberUsed[j] && !numberUsed[k])
                        {
                            numberOfPairs++;
                            numberUsed[i] = true;
                            numberUsed[j] = true;
                            numberUsed[k] = true;
                            System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = 0" );
                        }
                    }

        System.out.println("Numarul de perechi este " + numberOfPairs);

    }
}
