package code._4_student_effort.number_to_lcd;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            Path path = Paths.get("_4_exceptions_io/src/main/resources/input.txt");
            String number = Files.readAllLines(path).get(0);

            FileWriter myWriter2 = new FileWriter("_4_exceptions_io/src/main/resources/output.txt");
            myWriter2.write(lcd(Integer.parseInt(number)));
            myWriter2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String lcd (int n){
        int r1=reverseNumber(n);
        int r2=reverseNumber(n);
        int r3=reverseNumber(n);
        int r4=reverseNumber(n);
        int r5=reverseNumber(n);
        String res="";

        // iteration 1
        while (r1>0){
            if (r1%10 == 1 || r1%10 == 4) {
                res += "   ";
            } else {
                res += " - ";
            }
            r1=r1/10;
        }

        res += "\n";

        // iteration 2
        while (r2>0){
            switch (r2%10){
                case 0:
                    res += "| |";
                    break;
               case 1:
                    res += " | ";
                    break;
               case 2:
                    res+= "  |";
                    break;
               case 3:
                    res+="  |";
                    break;
               case 4:
                    res+="| |";
                    break;
               case 5:
                    res+="|  ";
                    break;
               case 6:
                    res+="|  ";
                    break;
               case 7:
                    res+="  |";
                    break;
               case 8:
                    res+="| |";
                    break;
               case 9:
                    res+="| |";
                    break;
            }

            r2=r2/10;
        }

        res += "\n";

//        iteration 3
        while (r3>0){
            switch (r3%10){
                case 0:
                    res += "   ";
                    break;
                case 1:
                    res += "   ";
                    break;
                case 2:
                    res+= " - ";
                    break;
                case 3:
                    res+=" - ";
                    break;
                case 4:
                    res+=" - ";
                    break;
                case 5:
                    res+=" - ";
                    break;
                case 6:
                    res+=" - ";
                    break;
                case 7:
                    res+="   ";
                    break;
                case 8:
                    res+=" - ";
                    break;
                case 9:
                    res+=" - ";
                    break;
            }

            r3=r3/10;
        }

        res += "\n";

        //        iteration 4
        while (r4>0){
            switch (r4%10){
                case 0:
                    res += "| |";
                    break;
                case 1:
                    res += " | ";
                    break;
                case 2:
                    res+= "|  ";
                    break;
                case 3:
                    res+="  |";
                    break;
                case 4:
                    res+="  |";
                    break;
                case 5:
                    res+="  |";
                    break;
                case 6:
                    res+="| |";
                    break;
                case 7:
                    res+="  |";
                    break;
                case 8:
                    res+="| |";
                    break;
                case 9:
                    res+="  |";
                    break;
            }

            r4=r4/10;
        }

        res += "\n";

        //        iteration 5
        while (r5>0){
            switch (r5%10){
                case 0:
                    res += " - ";
                    break;
                case 1:
                    res += "   ";
                    break;
                case 2:
                    res+= " - ";
                    break;
                case 3:
                    res+=" - ";
                    break;
                case 4:
                    res+="   ";
                    break;
                case 5:
                    res+=" - ";
                    break;
                case 6:
                    res+=" - ";
                    break;
                case 7:
                    res+="   ";
                    break;
                case 8:
                    res+=" - ";
                    break;
                case 9:
                    res+=" - ";
                    break;
            }

            r5=r5/10;
        }

        res += "\n";


        return res;
    }

    private static int reverseNumber(int n){
        int c=0;
        while (n>0){
            c=c*10+n%10;
            n=n/10;
        }
        return c;
    }
}
