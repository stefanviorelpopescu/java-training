package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SecretMessage {
    private static final List<String> lines = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        readText("_4_exceptions_io\\_test_files\\in\\message.txt");
        //System.out.println(lines);
        System.out.println(secretMessage());
    }
    public static void readText(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = bufferedReader.readLine())!=null){
            lines.add(line);
        }
    }
    public static String secretMessage(){
        String message;
        StringBuilder builder = new StringBuilder();
        char eachCharacter;
        for(String eachLine : lines)
        {
            for(int i = 0 ; i<eachLine.length();i++)
            {
                eachCharacter = eachLine.charAt(i);
                if(Character.isUpperCase(eachCharacter)){
                    if(eachCharacter == 'X'){
                        builder.append(" ");
                    }else{
                        builder.append(eachCharacter);
                    }
                }
            }
        }
        message = builder.toString();
        return message;
    }
}
