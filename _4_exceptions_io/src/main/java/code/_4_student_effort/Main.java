package code._4_student_effort;

import java.util.Arrays;

public class Main
{

  public static void main(String[] args)
  {

  }
}

//Problema 3
class AnagramProgram
{
  static void isAnagram(String s1, String s2)
  {

    String copyOfs1 = s1.replaceAll("s", "");

    String copyOfs2 = s2.replaceAll("s", "");


    boolean status = true;

    if(copyOfs1.length() != copyOfs2.length())
    {
      status = false;
    }
    else
    {

      char[] s1Array = copyOfs1.toLowerCase().toCharArray();

      char[] s2Array = copyOfs2.toLowerCase().toCharArray();

      Arrays.sort(s1Array);

      Arrays.sort(s2Array);

      status = Arrays.equals(s1Array, s2Array);
    }

    if(status)
    {
      System.out.println(s1+" and "+s2+" are anagrams");
    }
    else
    {
      System.out.println(s1+" and "+s2+" are not anagrams");
    }
  }
}

//Problema 4
class Lcd {
  public static void main(String[] args)
  {
    String arg = args[0];
    int numberOfChars = arg.length();
    int[][][] chars = new int[numberOfChars][3][3];
    int[][] one = {{0,0,0}, {0,0,1}, {0,0,1}};
    int[][] two = {{0,1,0}, {0,1,1}, {1,1,0}};
    int[][] three = {{0,1,0}, {0,1,1}, {0,1,1}};
    int[][] four = {{0,0,0}, {1,1,1}, {0,0,1}};
    int[][] five = {{0,1,0}, {1,1,0}, {0,1,1}};
    int[][] six = {{0,1,0}, {1,1,0}, {1,1,1}};
    int[][] seven = {{0,1,0}, {0,0,1}, {0,0,1}};
    int[][] eight = {{0,1,0}, {1,1,1}, {1,1,1}};
    int[][] nine = {{0,1,0}, {1,1,1}, {0,1,1}};
    int[][] zero = {{0,1,0}, {1,0,1}, {1,1,1}};
    int i, j, k;

    for(i=0; i<numberOfChars; i++)
    {
      if(arg.charAt(i)=='1') chars[i] = one;
      else if(arg.charAt(i)=='2') chars[i] = two;
      else if(arg.charAt(i)=='3') chars[i] = three;
      else if(arg.charAt(i)=='4') chars[i] = four;
      else if(arg.charAt(i)=='5') chars[i] = five;
      else if(arg.charAt(i)=='6') chars[i] = six;
      else if(arg.charAt(i)=='7') chars[i] = seven;
      else if(arg.charAt(i)=='8') chars[i] = eight;
      else if(arg.charAt(i)=='9') chars[i] = nine;
      else if(arg.charAt(i)=='0') chars[i] = zero;
      else chars[i] = four;
    }

    for (j = 0; j < 3; j++)
    {
      for (i = 0; i < numberOfChars; i++)
      {
        for (k = 0; k < 3; k++) {
          if (chars[i][j][k] == 1) {
            if (k == 1) System.out.print("_");
            else System.out.print("|");
          }
          else System.out.print(" ");
        }
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}

//Problema 5
class NoOfOccurenceOfCharacters
{
  static final int MAX_CHAR = 256;

  static void getOccuringChar(String str)
  {
    int count[] = new int[MAX_CHAR];

    int len = str.length();

    for (int i = 0; i < len; i++)
      count[str.charAt(i)]++;

    char ch[] = new char[str.length()];
    for (int i = 0; i < len; i++)
    {
      ch[i] = str.charAt(i);
      int find = 0;
      for (int j = 0; j <= i; j++)
      {
        if (str.charAt(i) == ch[j])
          find++;
      }

      if (find == 1)
        System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
    }
  }
}