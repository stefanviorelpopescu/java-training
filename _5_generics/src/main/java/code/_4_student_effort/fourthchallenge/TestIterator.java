package code._4_student_effort.fourthchallenge;

import code._4_student_effort.thirdchallenge.*;

public class TestIterator {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1,2,3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Car[] arrGen = new Car[10];
        for (int i = 0; i < arrGen.length; i++) {
            Car arrayCar = new Car(i + 10000L, i + 1998);
            arrGen[i] = arrayCar;
        }

        IArrayIterator<Car> itGen = new ArrayIterator<>(arrGen);
        while(itGen.hasNext()) {
            System.out.println(itGen.next());
        }
    }
}
