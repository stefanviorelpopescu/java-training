package code._4_student_effort;

public class ThirdChallenge {

    public void showInformationsAboutChallenge() {

        System.out.println("Given an array of integers, find the numbers of pairs from the array");
        System.out.println("A pair is defined as any 2 numbers added result 0");
        System.out.println("A number involved in a pair cannot be part of another pair");
    }

    public void run(int array[]) {

        boolean[] visited = new boolean[array.length];
        int count=0;

        for (int i=0;i<array.length-1;i++) {
            for (int j=i+1;j<array.length && !visited[i];j++) {
                if (array[i] + array[j] == 0) {
                    visited[i] = true;
                    visited[j] = true;
                    count ++;
                }
            }
        }

        System.out.println(count);

    }
}
