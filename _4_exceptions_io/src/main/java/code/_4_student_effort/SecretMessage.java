package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecretMessage {
    private String message="";
    private List<String> lines = new ArrayList<>();

    public void readFile(){
        try(Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\message.txt")))){
            while(s.hasNextLine()){
                lines.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void decodeMessage(){
        char current;
        for(String s : lines){
            for(int i=0; i<s.length(); i++){
                current = s.charAt(i);
                if(Character.isUpperCase(current)){
                    if(current == 'X'){
                        message += " ";
                    }
                    else{
                        message += current;
                    }
                }
            }
        }
    }

    public String getMessage(){
        return message;
    }
}
