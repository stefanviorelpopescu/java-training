package code._4_student_effort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {
//SecretMessage.discover();//challenge2
// Anagram.anagram_method();//challenge3
//challenge4();
// Occurrence.occurrendce_words();//challenge5

  }
  private static void challenge4()
  {
    int height=5;
    int width=3;
    //in momentul in care vom scrie o cifra in fisier
    //trebuie sa crestem latimea cu 2 (pentru colturile matricei
    //care trebuie sa fie goale
    List<Integer> list=new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    List<String[][]> format_numbers=new ArrayList<>();
    for(int i=0;i<list.size();i++)
    {

      String[][] t=new String[height][width+2];
      NumberToLcdCretu.initialise(t,height,width+2);
      NumberToLcdCretu.draw_number(list.get(i),t,height,width+2);
      format_numbers.add(t);

    }

    try {
      NumberToLcdCretu.writeInFile(format_numbers, height, width + 2);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("\nEroare la scrierea in fisier!");
    }
  }


}
