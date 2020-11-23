package code._2_challenge._4_pair_of_3;

import code._4_student_effort.Challenge3;
import code._4_student_effort.Challenge4;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

public class PairOf3Test {
  public static Map<Integer[], Integer> data = Map.ofEntries(
          entry(new Integer[]{-1, -1, -1, 2}, 1)
  );

  @org.junit.Test
  public void test() {
    Challenge4 c4 = new Challenge4();
    for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
      Integer[] input = entry.getKey();
      Integer expected = entry.getValue();
      Integer actual = c4.nrOfPairs(input);
      System.out.println("for input: " + Arrays.asList(input) + "  output:" + actual);
      Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
    }
  }
}