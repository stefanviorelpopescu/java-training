package code._4_student_effort.secondchallenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {

    public static void main(String[] args) {

        new SecretMessage().parseSecretFile("message.txt");
    }

    public String parseSecretFile(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String fileContent = scanner.useDelimiter("\\Z").next();
        fileContent = fileContent.replaceAll("[^A-Z]", "");
        fileContent = fileContent.replaceAll("X", " ");
        System.out.println(fileContent);

        return fileContent;
    }
}
