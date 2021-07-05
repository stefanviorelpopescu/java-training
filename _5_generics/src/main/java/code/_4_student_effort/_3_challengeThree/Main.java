package code._4_student_effort._3_challengeThree;

public class Main {
// am folosit rezolvarea ca si exemplu
    public static void main(String[] args) {
        String nodeValue = "a";
        GenericList<String> list = new GenericList<>(nodeValue);

        for (int i = 0; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (nodeValue.charAt(0) + i))));
        }

        list.println();
    }
}
