package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    // TODO put your code changes in here
    // System.out.println("This is a test for our first PR.");
    // System.out.println("Testing out our 2nd commit.");

    /* Challenge 1 */
    CodeChallengeOne codeChallengeOne = new CodeChallengeOne();
    System.out.println("Challenge 1");
    codeChallengeOne.print();

    System.out.println("-----------");

    /* Challenge 2 */
    CodeChallengeTwo codeChallengeTwo = new CodeChallengeTwo();
    System.out.println("Challenge 2");
    System.out.println(codeChallengeTwo.compute(13));

    System.out.println("-----------");

    /* Challenge 3 */
    CodeChallengeThree codeChallengeThree = new CodeChallengeThree();
    int[] array = {3, 2, -3, -2, 3, 0};
    ArrayList<Integer> arrayCollection = new ArrayList<>(Arrays.asList(3, 2, -3, -2, 3, 0));
    System.out.println("Challenge 3");
    System.out.println("No. of pairs: " + codeChallengeThree.pairsOf2WithoutCollections(array)); // pentru rezolvarea acestui task fara a folosi Colectiile m-am inspirat PUTIN din rezolvare
    System.out.println("No. of pairs: " + codeChallengeThree.pairsOf2WithCollections(arrayCollection));

    System.out.println("-----------");

    /* Challenge 4 */
    CodeChallengeFour codeChallengeFour = new CodeChallengeFour();
    int[] anotherArray = {-1, -1, -1, 2};
    ArrayList<Integer> anotherArrayCollection = new ArrayList<>(Arrays.asList(-1, -1, -1, 2));
    System.out.println("Challenge 4");
    System.out.println("No. of pairs: " + codeChallengeFour.pairsOf3WithoutCollections(anotherArray));
    System.out.println("No. of pairs: " + codeChallengeFour.pairsOf3WithCollections(anotherArrayCollection));
  }
}
