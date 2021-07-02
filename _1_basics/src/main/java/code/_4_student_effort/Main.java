package code._4_student_effort;

public class Main
{
  public static void main(String[] args)
  {

  }

  //Challenge 1
  static void fizzBuzz()
  {
    int nr = 100;
    int i;

    for ( i=0; i<nr; i++)
    {
      //Daca numarul este divizibil cu 3, se va afisa Fizz
      if (i%3==0)
        System.out.println("Fizz"+" ");
        //Daca numarul este divizibil cu 5, se va afisa Buzz
      else if (i%5==0)
        System.out.println("Buzz"+" ");
        //Daca numarul este divizibil atat cu 5 cat si cu 3, se va afisa FizzBuzz
      else if (i%5==0 && i%3==0)
        System.out.println("FizzBuzz"+" ");
        //Daca numarul este divizibil cu 7, se va afisa Rizz
      else if (i%7==0)
        System.out.println("Rizz"+" ");
        //Daca numarul este divizibil cu 11, se va afisa Jazz
      else if (i%11==0)
        System.out.println("Jazz"+" ");
      else
        System.out.println(i+" ");
    }
  }

  //Challenge 2
  static void fooBarQix()
  {
    int nr;

    String result_string = "";

    Boolean check = false;
    if (nr < 3)
    {
      System.out.println(nr);
      return;
    }

    if (nr % 3 == 0)
    {
      result_string += "Foo";
      check = true;
    }

    if (nr % 5 == 0)
    {
      result_string += "Bar";
      check = true;
    }

    if (nr % 7 == 0)
    {
      result_string += "Qix";
      check = true;
    }

    if (nr < 9)
    {
      if (!check)
      {
        System.out.println(nr);
        return;
      }

      if (nr == 3)
      {
        result_string += "Foo";
      }

      if (nr == 5)
      {
        result_string += "Bar";
      }

      if (nr == 7) {
        result_string += "Qix";
      }
    }

    //Challenge 3
    static void pairOf2()
    {
      int i;
      int dimension=50;
      int counter=0;

      int[] vector = new int[100];
      int[] freqVector = new int[100];

      for(i=0; i<vector.length; i++)
      {
        freqVector[dimension+vector[i]]++;
      }

      for(i=0; i<50; i++)
      {
        counter+=min(freqVector[i],freqVector[i+dimension]);
      }

      System.out.println(counter);
    }

    //Challenge 4
    public static void pairOf3(int[] numbers)
    {
      int counter = 0;
      int[] vector = new int[100];
      int nr = 0;
      for (int i = 0; i < vector.length - 2; i++)
      {
        for (int j = i + 1; j < vector.length - 1; j++)
        {
          for (int k = j + 1; k < vector.length; k++)
          {
            boolean check = false;
            for (int p = 0; p < nr; p++)
            {
              if (vector[p] == i || vector[p] == j || vector[p] == k)
              {
                check = true;
              }
            }
            if (!check && (numbers[i] + numbers[j] + numbers[k] == 0))
            {
              vector[nr++] = i;
              vector[nr++] = j;
              vector[nr++] = k;
              counter++;

              break;
            }
          }
        }
      }
      return counter;
    }
  }
}
