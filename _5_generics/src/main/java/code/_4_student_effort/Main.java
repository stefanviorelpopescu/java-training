package code._4_student_effort;

import code._4_student_effort.CodeChallenge1.EURO;
import code._4_student_effort.CodeChallenge1.ExchangeDesk;
import code._4_student_effort.CodeChallenge1.RON;
import code._4_student_effort.CodeChallenge2.ColorsDoNotMatchException;
import code._4_student_effort.CodeChallenge2.Pair;
import code._4_student_effort.CodeChallenge2.Running;
import code._4_student_effort.CodeChallenge2.SizesDoNotMatchException;
import code._4_student_effort.CodeChallenge3.GenericList;
import code._4_student_effort.CodeChallenge4.ArrayIterator;
import code._4_student_effort.CodeChallenge4.IArrayIterator;
import code._4_student_effort.CodeChallenge5.ArrayNotSortedException;
import code._4_student_effort.CodeChallenge5.GenericBinarySearch;

public class Main {

    public static void main(String[] args) throws SizesDoNotMatchException, ColorsDoNotMatchException, ArrayNotSortedException {

        System.out.println("\nCode challenge 2:");
        codeChallenge2();

        System.out.println("\nCode challenge 3:");
        codeChallenge3();

        System.out.println("\nCode challenge 4:");
        codeChallenge4();

        System.out.println("\nCode challenge 5:");
        codeChallenge5();

        System.out.println("\nCode challenge 6:");

    }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 2 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    public static void codeChallenge2() throws SizesDoNotMatchException, ColorsDoNotMatchException {

        // Code that should run
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);

        Pair<Running> pairOk = new Pair<>(runningShoe1, runningShoe2);

        //Code that should not compile
   /* Running runningShoe3 = new Running("RED", 41);
    Boot bootShoe = new Boot("Black",45);

    Pair<Running> pairKO = new Pair<>(runningShoe3,bootShoe);*/

        //Code that should throw size do no match exception
    /*Running runningShoe4 = new Running("RED", 41);
    Running runningShoe5 = new Running("RED", 42);

    Pair<Running> pairOK = new Pair<>(runningShoe4, runningShoe5);*/

    }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 3 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    public static void codeChallenge3() {

        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);

        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }

        list.println();
    }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 4 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    public static void codeChallenge4() {

        Integer[] arr = new Integer[] {1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 5 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    public static void codeChallenge5() throws ArrayNotSortedException {

        Integer[] list = {1, 4, 7, 9, 12, 13};
        // test if 7 is in the list ----- direction can be either 0 (descending) or 1 (ascending)
        System.out.println(GenericBinarySearch.binarySearch(list,7,1,0,list.length - 1));

    }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 6 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    public static void codeChallenge6() {

        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON ron = new RON(500);
        EURO euro = new EURO();
        EURO ronInEuro = (EURO) exchangeDesk.convert(euro, ron, 0.3 );
        System.out.println(euro);
    }
}

