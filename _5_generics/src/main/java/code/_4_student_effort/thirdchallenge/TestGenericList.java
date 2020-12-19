package code._4_student_effort.thirdchallenge;

public class TestGenericList {

    public static void main(String[] args) {
        String rootValue = "a";
        IGenericList<String> list = new GenericList<>(rootValue);

        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();

    }
}
