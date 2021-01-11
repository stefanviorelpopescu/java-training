package code._4_student_effort;

import javafx.util.converter.ByteStringConverter;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {



  public static void LCD(){

    try {
File f=new File(System.getProperty("user.dir")+"\\_4_exceptions_io\\_test_files\\in\\input_number.txt");
FileInputStream fin=new FileInputStream(f);
byte[] numar=new byte[fin.available()];
fin.read(numar);
Integer nr=Integer.valueOf(new String(numar));
System.out.println(nr);
ArrayList<Integer> cifre=new ArrayList<Integer>();

fin.close();
    }
    catch(IOException e){
      System.out.println("nu exista");
    }
LCD lcd=new LCD();

  }

  public static void main(String[] args) {
Main.LCD();

  }
}
