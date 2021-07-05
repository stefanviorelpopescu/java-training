package code._4_student_effort;

public class ArrayIteratorMain {
    public static void main(String[] args) {
        // Stage 1
        Integer[] arr = new Integer[]{1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Stage 2 - String");
        // Stage 2
        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);
        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        IArrayIterator<Object> iteratorList = new ArrayIterator<Object>(list.getValues());
        while (iteratorList.hasNext()) {
            System.out.println(iteratorList.next());
        }

        System.out.println("Stage 2 - Integer");
        Integer rootValueInteger = 0;
        GenericList<Integer> integerGenericList = new GenericList<>(rootValueInteger);
        for (int i = 1; i < 10; i++) {
            integerGenericList.insert(i);
        }

        IArrayIterator<Object> iteratorListInteger = new ArrayIterator<Object>(integerGenericList.getValues());
        while (iteratorListInteger.hasNext()) {
            System.out.println(iteratorListInteger.next());
        }
    }
}
