package code._4_student_effort;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class LCD {
    private String s1 = "  |";
    private String s2 = "| |";
    private String s3 = "|  ";
    private String s4 = "|_|";
    private String s5 = " _|";
    private String s6 = "|_ ";
    private String s7 = "  |";
    private String s8 = " _ ";
    private String s9 = "   ";

    public class LCDNr {
        String in, mij, sf;

        LCDNr(String pin, String pmij, String psf) {
            in = pin;
            mij = pmij;
            sf = psf;
        }
    }


    public void getText(ArrayList<Integer> a, FileOutputStream out) {
        LCDNr l1 = new LCDNr(s9, s1, s1);
        LCDNr l2 = new LCDNr(s8, s4, s1);
        LCDNr l3 = new LCDNr(s8, s5, s5);
        LCDNr l4 = new LCDNr(s9, s5, s6);
        LCDNr l5 = new LCDNr(s8, s6, s5);
        LCDNr l6 = new LCDNr(s8, s6, s4);
        LCDNr l7 = new LCDNr(s8, s1, s1);
        LCDNr l8 = new LCDNr(s8, s4, s4);
        LCDNr l9 = new LCDNr(s8, s4, s1);
        LCDNr l0 = new LCDNr(s8, s2, s8);
        String linie1 = "";
        String linie2 = "";
        String linie3 = "";
        for (Integer i : a) {
            switch (i.intValue()) {
                case 1: {
                    linie1 += l1.in;
                    linie2 += l1.mij;
                    linie3 += l1.sf;
                    break;
                }
                case 2: {
                    linie1 += l2.in;
                    linie2 += l2.mij;
                    linie3 += l2.sf;
                    break;
                }
                case 3: {
                    linie1 += l3.in;
                    linie2 += l3.mij;
                    linie3 += l3.sf;
                    break;
                }
                case 4: {
                    linie1 += l4.in;
                    linie2 += l4.mij;
                    linie3 += l4.sf;
                    break;
                }
                case 5: {
                    linie1 += l5.in;
                    linie2 += l5.mij;
                    linie3 += l5.sf;
                    break;
                }
                case 6: {
                    linie1 += l6.in;
                    linie2 += l6.mij;
                    linie3 += l6.sf;
                    break;
                }
                case 7: {
                    linie1 += l7.in;
                    linie2 += l7.mij;
                    linie3 += l7.sf;
                    break;
                }
                case 8: {
                    linie1 += l8.in;
                    linie2 += l8.mij;
                    linie3 += l8.sf;
                    break;
                }
                case 9: {
                    linie1 += l9.in;
                    linie2 += l9.mij;
                    linie3 += l9.sf;
                    break;
                }
                case 0: {
                    linie1 += l0.in;
                    linie2 += l0.mij;
                    linie3 += l0.sf;
                    break;
                }
            }

        }
        try {
            out.write(linie1.getBytes());
            out.write(linie2.getBytes());
            out.write(linie3.getBytes());
        }
        catch(IOException e){
            System.out.println(" ");
        }
    }


}
