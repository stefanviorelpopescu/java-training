package code._3_in_class;

import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

  public static void main(String[] args) {
    LocalTime time= LocalTime.of(0,45,0);
   //time.setTime(3600);
    //Calendar.get(Calendar.MINUTE)
    System.out.println(time.getMinute());
  }
}