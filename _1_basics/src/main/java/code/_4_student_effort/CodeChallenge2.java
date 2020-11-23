package code._4_student_effort;
import java.util.Scanner;
public class CodeChallenge2 {

        public static void main(String[] arggs) {

            System.out.println("CodeChallenge2");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            String s = "";
            if (i % 3 == 0) s += "Foo";
            if (i % 5 == 0) s += "Bar";
            if (i % 7 == 0) s += "Qix";

            char[] characters = String.valueOf(i).toCharArray();
            for (char ch : characters) {
                if (ch == '3') s += "Foo";
                if (ch == '5') s += "Bar";
                if (ch == '7') s += "Qix";
                if (ch == '0') s += "*";
            }
            if (s.isEmpty()) {
                s = String.valueOf(i);
            }
            System.out.println(s);
        }
    }

