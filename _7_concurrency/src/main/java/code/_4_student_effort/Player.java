package code._4_student_effort;

import java.util.Random;

public class Player extends Thread{
    String s_ran;
    public void run(){
        System.out.println(ran());
    }
    public String ran(){
        String[] s = {"rock", "paper", "scrissors"};
        Random ran = new Random();
        s_ran = s[ran.nextInt(s.length)];
        return s_ran;
    }
}
