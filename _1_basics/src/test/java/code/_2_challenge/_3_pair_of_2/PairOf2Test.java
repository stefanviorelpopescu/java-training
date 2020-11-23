package code._2_challenge._3_pair_of_2;

import code._4_student_effort.Challenge3;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Map;

import static java.util.Map.entry;

public class PairOf2Test {
  public static Map<Integer[], Integer> data = Map.ofEntries(
          entry(new Integer[]{3, 2, -3, -2, 3, 0}, 2),
          entry(new Integer[]{1, 1, 0, -1, -1}, 2),
          entry(new Integer[]{5, 9, -5, 7, -5}, 1)
  );

  @org.junit.Test
  public void test() {
    Challenge3 c3 = new Challenge3();
    for (Map.Entry<Integer[], Integer> entry : data.entrySet()) {
      Integer[] input = entry.getKey();
      Integer expected = entry.getValue();
      Integer actual = c3.nrOfPairs(input);
      System.out.println("for input: " + Arrays.asList(input) + "  output:" + actual);
      Assert.assertEquals("for input: " + Arrays.asList(input), expected, actual);
    }
  }
}