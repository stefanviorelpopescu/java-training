package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private static final List<String> names = new ArrayList<>();
    private static final List<String> number = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        String searchedPerson1 = "Abdul";
        String searchedPerson2 = "Abbie";
        String searchedPerson3 = "Pantilimon";
        readPhoneBook("_4_exceptions_io\\_test_files\\in\\phonebook.txt");
        System.out.println(searchPhoneNumber(searchedPerson1));
        System.out.println(searchPhoneNumber(searchedPerson2));
        System.out.println(searchPhoneNumber(searchedPerson3));
    }
    public static void readPhoneBook(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String[] words;
        String line;
        while((line=bufferedReader.readLine())!=null)
        {
            words = line.split(" ");
            if(words.length < 2){
                continue;
            }else{
                names.add(words[0]);
                number.add(words[1]);
            }
        }
    }
    public static String searchPhoneNumber(String name){
        for (int i = 0;i<names.size();i++){
            if(names.get(i).equals(name)){
                return number.get(i);
            }
        }
        return "Number not found or person does not exists.";
    }
}
