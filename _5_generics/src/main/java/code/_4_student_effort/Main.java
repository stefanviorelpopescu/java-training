package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    // Challenge 1
    //doChallenge1();

    // Challenge 2
    //printChallengeSeparator(2);
    doChallenge2();

    // Challenge 3
    printChallengeSeparator(3);
    doChallenge3();

    // Challenge 4
    System.out.println();
    printChallengeSeparator(4);
    doChallenge4();

    // Challenge 5
    printChallengeSeparator(5);
    doChallenge5();
  }

  // Challenge 1 usage in main function
  public static void doChallenge1() {
    ExchangeDesk exchangeDesk = new ExchangeDesk();
    RON lei = new RON();
    lei.setAmountOfMoney(1000d);
    // Stage 1
    // USD.class - is the type of the class
    USD dollar = exchangeDesk.convert(lei, USD.class);

    // Stage 2
    USD dollar2 = exchangeDesk.convert2(lei, USD.class, 3d);
  }

  // Challenge 2 usage in main function
  public static void doChallenge2() {
    // Stage 1
    Running runningShoe1 = new Running("RED", 41);
    Running runningShoe2 = new Running("RED", 41);
    Pair<Running> pairOK = new Pair<>(runningShoe1,runningShoe2);

    Boot bootShoe = new Boot("BLACK", 45);
    //Pair<Running> pairKO = new Pair<>(runningShoe1, bootShoe);

    // Stage 2
    Running runningShoe3 = new Running("RED", 42);
    //Pair<Running> pairKO2 = new Pair<>(runningShoe1, runningShoe3);

    Running runningShoe4 = new Running("BLACK", 41);
    //Pair<Running> pairKO3 = new Pair<>(runningShoe1, runningShoe4);
  }

  // Challenge 3 usage in main function
  public static void doChallenge3() {
    String rootValue = "a";
    GenericList<String> list = new GenericList<>(rootValue);
    for (int i = 0; i < 10; i++) {
      list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
    }
    list.println();
  }

  // Challenge 4 usage in main function
  public static void doChallenge4() {
      // Stage 1
      doChallenge4Stage1();

      // Stage 2 TODO
      //doChallenge4Stage2();
  }

  // Stage 1 usage method in Challenge 5 function
  public static void doChallenge4Stage1() {
      Integer[] arr = new Integer[] { 1, 2, 3 };
      IArrayIterator<Integer> it = new ArrayIterator<>(arr);
      while (it.hasNext()) {
          System.out.println(it.next());
      }
  }

  // Stage 2 usage method in Challenge 5 function
  public static void doChallenge4Stage2() {
      String rootValue = "a";
      GenericList<String> list = new GenericList<>(rootValue);
      for (int i = 0; i < 10; i++) {
          list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
      }
      IArrayIterator<String> iterator = new ArrayIterator<>(list);
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }
  }

  // Challenge 5 usage in main function
  public static void doChallenge5() {
    Integer[] unsortedArr = new Integer[] { 9, 5, 7, 4, 2, 8, 1, 3 };
    Integer[] ascSortedArr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    Integer[] descSortedArr = new Integer[] { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

    //System.out.println(binarySearch(unsortedArr, 5));
    System.out.println(binarySearch(ascSortedArr, 3));
    System.out.println(binarySearch(ascSortedArr, 10));
    System.out.println(binarySearch(descSortedArr, 5));
  }

  public static <T extends Comparable> int binarySearch(T[] array, T value) {
      if ((array == null) || (array.length == 0)) { System.out.println("Array is empty!"); }

      boolean orderType = getOrderType(array);

      if (isSorted(array, orderType)) {
          return binarySearch(array, value, 0, array.length - 1, orderType);
      } else {
          return -1;
      }
  }

  // Method that returns:
  //   true if array has an ascending order
  //   false if array has a descending order
  public static <T extends Comparable> boolean getOrderType(T[] array) {
      int orderType = (array[0]).compareTo(array[1]);

      // handle duplicates
      for (int i = 1; i < array.length - 1; i++) {
          orderType = (array[i]).compareTo(array[i+1]);
          if (array[0].equals(array[1]))
              break;
      }

      return (orderType < 0);
  }

  // Method that checks if an array is sorted - returns:
  //   true if the array is sorted in ascending or descending order
  public static <T extends Comparable> boolean isSorted(T[] array, boolean orderType) throws ArrayNotSortedException {
      if (array.length < 1) return true;

      for (int i = 0; i < array.length - 1; i++) {
          if ((array[i].compareTo(array[i + 1]) <= 0) != orderType) {
              throw new ArrayNotSortedException("Array is not sorted!");
          }
      }

      return true;
  }

    public static <T extends Comparable> int binarySearch(T[] array, T value, int low, int high, boolean orderType) {
        if (low > high) return -1;

        int mid = (low + high)/2;

        if (array[mid].compareTo(value) < 0) {
            binarySearch(array, value, low, mid-1, orderType);
        } else if (array[mid].compareTo(value) > 0) {
            binarySearch(array, value, mid+1, high, orderType);
        } else {
            return mid;
        }

        // TODO descending case
        /*if (array[mid] == value) {
            return mid;
        } else if (compareValuesAccordingOrderType(array[mid], value, orderType)) {
            binarySearch(array, value, low, mid, orderType);
        } else {
            binarySearch(array, value, mid+1, high, orderType);
        }*/

        return -1;
    }

    public static <T extends Comparable> boolean compareValuesAccordingOrderType(T value1, T value2, boolean orderType) {
        return ((value1.compareTo(value2) < 0) == orderType);
    }

    // Method for printing separator between challenges
    static public void printChallengeSeparator(int challengeNumber) {
        System.out.println("======================== Challenge " + challengeNumber +
            " ==================================");
    }
}
