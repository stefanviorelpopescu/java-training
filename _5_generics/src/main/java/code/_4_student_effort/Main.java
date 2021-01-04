package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
//    challenge2();
    challenge3();
    //challenge4();

  }


  protected static void challenge2() {
    Running runningShoe1= new Running("RED",41);
    Running runningShoe2= new Running("RED",41);
    Pair<Running> pairOK= new Pair<>(runningShoe1,runningShoe2);

    Boot bootShoe =new Boot("BALCK", 45);
//    Pair<Running> pairKO= new Pair<>(runningShoe1, bootShoe);
    Running runningShoe3= new Running("RED",41);
    Running runningShoe4= new Running("RED",42);
    Pair<Running> pairOK2= new Pair<>(runningShoe3,runningShoe4);
  }

  protected static void challenge3()
  {
    String rootValue= "a";
    GenericList<String> list= new GenericList<>(rootValue);
    for(int i=0;i<10;i++) {
      list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
    }
    list.println();
  }

  protected static void challenge4() {

    Integer[] arr= new Integer[] {1,2,3};
    IArrayIterator<Integer> it= new ArrayIterator<>(arr);
    while(it.hasNext())
    {
      System.out.println(it.next());
    }
  }
}