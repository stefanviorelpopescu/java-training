package code._4_student_effort;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberToLCD {
    private List<Segment> segmentToPrint = new ArrayList<>();
    private List<Integer> numbers = new ArrayList<>();

    public void readFile(){
        try{
            Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\input_number.txt")));
            String input = "";
            while(s.hasNextLine()){
                input = s.next();
            }
            convertInputToDigits(input);
            convertDigitsToSegments();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void convertInputToDigits(String input){
        for(int i = 0; i < input.length(); i++){
            numbers.add(Integer.parseInt(String.valueOf(input.charAt(i))));
        }
    }
    public void convertDigitsToSegments(){
        for(Integer i : numbers){
            switch (i){
                case 0: {
                    segmentToPrint.add(new Segment(true,true,true,true,true,true,false));
                    break;
                }
                case 1:{
                    segmentToPrint.add(new Segment(false,true,true,false,false,false,false));
                    break;
                }
                case 2:{
                    segmentToPrint.add(new Segment(true,true,false,true,true,false,true));
                    break;
                }
                case 3:{
                    segmentToPrint.add(new Segment(true,true,true,true,false,false,true));
                    break;
                }
                case 4:{
                    segmentToPrint.add(new Segment(false,false,true,false,false,true,true));
                    break;
                }
                case 5:{
                    segmentToPrint.add(new Segment(true,false,true,true,false,true,true));
                    break;
                }
                case 6:{
                    segmentToPrint.add(new Segment(false, false, true, true, true, true, true));
                    break;
                }
                case 7:{
                    segmentToPrint.add(new Segment(true,true,true,false,false,false,false));
                    break;
                }
                case 8:{
                    segmentToPrint.add(new Segment(true,true,true,true,true,true,true));
                    break;
                }
                case 9:{
                    segmentToPrint.add(new Segment(true,true,true,true,false,true,true));
                    break;
                }
            }
        }
    }

    public void printSegments(int width, int heigth){
        try {
            FileWriter writer = new FileWriter("_4_exceptions_io\\_test_files\\in\\output.txt");
            String lineToWrite = "";
            for(Segment s : segmentToPrint){
                lineToWrite += " ";
                for(int j = 0; j < width-1; j++){
                    if(s.isA()) lineToWrite += "_";
                    else lineToWrite += " ";
                }
                lineToWrite += " ";
            }
            writer.write(lineToWrite);
            writer.write("\n");
            System.out.println(lineToWrite);
            lineToWrite = "";
            for(int i=0; i < heigth/2; i++){
                for(Segment s : segmentToPrint){
                    lineToWrite += "";
                    if(s.isF()) lineToWrite += "|";
                    else lineToWrite += " ";

                    if(i == heigth/2 -1){
                        for(int j=0; j < width-1; j++){
                            if(s.isG()) lineToWrite += "_";
                            else lineToWrite += " ";
                        }
                    }
                    else {
                        for(int j=0; j < width-1; j++){
                           lineToWrite += " ";
                        }
                    }

                    if(s.isB()) lineToWrite += "|";
                    else lineToWrite += " ";
                }
                writer.write(lineToWrite);
                writer.write("\n");
                System.out.println(lineToWrite);
                lineToWrite = "";
            }

            for(int i=0; i < heigth/2; i++){
                for(Segment s : segmentToPrint){
                    lineToWrite += "";
                    if(s.isE()) lineToWrite += "|";
                    else lineToWrite += " ";

                    if(i == heigth/2 -1){
                        for(int j=0; j < width-1; j++){
                            if(s.isD()) lineToWrite += "_";
                            else lineToWrite += " ";
                        }
                    }
                    else {
                        for(int j=0; j < width-1; j++){
                            lineToWrite += " ";
                        }
                    }

                    if(s.isC()) lineToWrite += "|";
                    else lineToWrite += " ";
                }
                writer.write(lineToWrite);
                writer.write("\n");
                System.out.println(lineToWrite);
                lineToWrite = "";
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
