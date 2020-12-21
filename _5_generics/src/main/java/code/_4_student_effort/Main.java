package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    ExchangeDesk exchangeDesk = new ExchangeDesk();
    RON lei = new RON(1_000);
    USD dollar = exchangeDesk.convert(lei, USD.class, 4.1d);
    System.out.println(dollar);
    System.out.println("\n");

    //Challange 2

    Running runningShoe1 = new Running("RED", 41);
    Running runningShoe2 = new Running("RED", 41);
    Pair<Running> pairOK = new Pair<>(runningShoe1,runningShoe2);

    //Challange 3

    String rootValue = "a";
    GenericList<String> list = new GenericList<>(rootValue);
    for (int i = 1; i < 10; i++) {
      list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
    }
    list.println();

    //Challange 4
    Integer[] arr = new Integer[] {1, 2, 3};
    IArrayIterator<Integer> it = new ArrayIterator<>(arr);
    while (it.hasNext()) {
      System.out.println(it.next());
    }

  }
}
