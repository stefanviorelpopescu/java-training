package code._4_student_effort;

public class CodeChallengeTwo {

    String compute(Integer a) {
        String string = String.valueOf(a);
        String output = "";
        if (a%3 == 0) {
            output += "Foo";
        } else if (a%5 == 0) {
            output += "Bar";
        } else if (a%7 == 0) {
            output += "Qix";
        } else if (string.contains("3")) {
            output += "Foo";
        } else if (string.contains("5")) {
            output += "Bar";
        } else if (string.contains("7")) {
            output += "Qix";
        } else output += a;
        return output;
    }
}
