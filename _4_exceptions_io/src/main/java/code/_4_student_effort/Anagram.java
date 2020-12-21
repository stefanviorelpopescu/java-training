package code._4_student_effort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Anagram {
    private static final String SMALL_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    private static final String BIG_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\anagram.txt";

    static void copy(String[] words, Writer writer) throws IOException {
        if (writer != null) writer.close();
        for (int i = 0; i < words.length; i++) {
            writer.write(words[i]);
        }
    }


    void anagm(String str, int start, int end)
    {
        if (start == end)
            System.out.println(str);
        else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                anagm(str, start + 1, end);
                str = swap(str, start, i);
            }
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE));
                //copy(str, bufferedWriter);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
