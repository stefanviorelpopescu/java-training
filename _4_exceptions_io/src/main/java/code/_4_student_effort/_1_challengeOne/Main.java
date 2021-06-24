package code._4_student_effort._1_challengeOne;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String p1 = "Abbey";
        String p2 = "Abdul";
        String p3 = "AndreiZahan";
        String url = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt";
        read(url, p1);
        read(url, p2);
        read(url, p3);
    }

    public static void read (String url, String name) throws IOException {
        URL url1 = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(url1.openStream()));
        String line;
        while ((line = in.readLine()) != null) {
            if (line.contains(name)) {
                System.out.println(line);
            }
        }
        in.close();
    }
}
