package code._4_student_effort;

public class FourthChallenge {
    public void showInformationsAboutChallenge() {

        System.out.println("Given an array of integers, find the numbers of pairs from the array");
        System.out.println("A pair is defined as any 3 numbers added result 0");
        System.out.println("A number involved in a pair cannot be part of another pair");
    }

    public void run(int array[]) {

        boolean[] visited = new boolean[array.length];
        int count=0;

        for (int i=0;i<array.length-2;i++) {
            for (int j=i+1;j<array.length-1 && !visited[i];j++) {
                for (int k=j+1;k<array.length && !visited[j];k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        visited[i] = true;
                        visited[j] = true;
                        visited[k] = true;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}
