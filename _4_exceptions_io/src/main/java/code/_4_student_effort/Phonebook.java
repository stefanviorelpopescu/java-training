package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phonebook {

    private List<String> names = new ArrayList<>();
    private List<String> numbers = new ArrayList<>();

    public void readPhonebook(){
        String name, number;
        try{
            Scanner file = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\phonebook.txt")));
            while(file.hasNext()){
               name = file.next();
               names.add(name);
               if(file.hasNext()) {
                   number = file.next();
                   numbers.add(number);
               }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printPairs(){
        for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(i) + ": " + numbers.get(i));
        }
    }

    public String findNumberByName(String name){
        if(names.contains(name)){
            return numbers.get(names.indexOf(name));
        }
        return null;
    }
}
