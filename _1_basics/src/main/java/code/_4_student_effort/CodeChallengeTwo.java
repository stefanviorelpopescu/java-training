package code._4_student_effort;

public class CodeChallengeTwo {

    // stage 1
    StringBuilder compute1(Integer a) {
        char[] chars = String.valueOf(a).toCharArray();
        StringBuilder output = new StringBuilder();
        if (a%3 == 0) {
            output.append("Foo");
        }
        if (a%5 == 0) {
            output.append("Bar");
        }
        if (a%7 == 0) {
            output.append("Qix");
        }
        for (char character : chars) {
            switch (character) {
                case '3' -> output.append("Foo");
                case '5' -> output.append("Bar");
                case '7' -> output.append("Qix");
            }
        }
        if (output.toString().isEmpty()) {
            output.append(a);
        }
        return output;
    }

    // stage 2
    String compute2 (int a) {
        char[] chars = String.valueOf(a).toCharArray();
        String output = "";
        boolean divided = false;
        if (a%3 == 0) {
            output += "Foo";
            divided = true;
        }
        if (a%5 == 0) {
            output += "Bar";
            divided = true;
        }
        if (a%7 == 0) {
            output += "Qix";
            divided = true;
        }
        for (char character : chars) {
            if (character == '3') {
                output += "Foo";
            } else if (character == '5') {
                output += "Bar";
            } else if (character == '7') {
                output += "Qix";
            } else if (character == '0') {
                output += "*";
            } else if (!divided) {
                output += character;
            }
        }
        return output;
    }

}
