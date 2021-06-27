package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
//    //TODO put your code changes in here
//    Phonebook pb = new Phonebook();
//    pb.readPhonebook();
//    //pb.printPairs();
//    if(pb.findNumberByName("Abbey") != null){
//      System.out.println(pb.findNumberByName("Abbey"));
//    }
//    if(pb.findNumberByName("Abdul") != null){
//      System.out.println(pb.findNumberByName("Abdul"));
//    }

//    SecretMessage sm = new SecretMessage();
//    sm.readFile();
//    sm.decodeMessage();
//    System.out.println(sm.getMessage());

//    NumberToLCD numberToLCD = new NumberToLCD();
//    numberToLCD.readFile();
//    numberToLCD.printSegments(6,6);

    Occurrence oc = new Occurrence();
    oc.readFile();
    oc.sortByValue(false);
  }
}
