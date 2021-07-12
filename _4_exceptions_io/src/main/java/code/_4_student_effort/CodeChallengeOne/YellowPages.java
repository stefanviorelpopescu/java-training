package code._4_student_effort.CodeChallengeOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


class NameNotFoundException extends Exception{
    public NameNotFoundException(String errorMessage)
    {
        super(errorMessage);
    }
}

public class YellowPages {
    private static final int MAX_NUMBER = 10_000;
    private static String FILE_NAME="_4_exceptions_io\\_test_files\\in\\phonebook.txt";
    public static void main(String[] args){
        try {ArrayList<String>names=new ArrayList<>();
            HashMap<String,String> phoneAndName=readYellowPages(FILE_NAME);
            names.add("Abbey");
            names.add("Abdul");
            for(String name:names)
            System.out.println(returnNameFromYellowPages(name,phoneAndName));

        } catch (FileNotFoundException | NameNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static String returnNameFromYellowPages(String name,HashMap<String,String>phoneAndName) throws NameNotFoundException {

            for(String phoneAndNameInYellowPages:phoneAndName.keySet()){
                if(phoneAndNameInYellowPages.equals(name))
                    return phoneAndName.get(name);
                }
        throw new NameNotFoundException("name not found");
    }


    public static HashMap<String, String> readYellowPages(String fileName) throws FileNotFoundException {
        HashMap<String,String>phoneAndName=new HashMap<>();
        Scanner s=null;
        int wordCount=0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext() && wordCount < MAX_NUMBER) {
                phoneAndName.put( s.next(),s.next());

                wordCount++;
            }
        } finally {
            if (s != null) s.close();
        }
        HashMap<String,String>wordLength=new HashMap<>();
        wordLength.putAll(phoneAndName);

    return wordLength;
    }
}
