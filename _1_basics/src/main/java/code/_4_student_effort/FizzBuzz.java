package code._4_student_effort;

public class FizzBuzz {
    static private String checkMultiplesStage1(int i){
        String multiplesOutput = "";
        int[] numbers = {3,5};
        String[] words = {"Fizz","Buzz"};
        boolean divided=false;
        for(int k=0;k< numbers.length;k++){
            if(i%numbers[k]==0){
                divided=true;
                multiplesOutput+=words[k];
            }
        }
        if(!divided){
            multiplesOutput +=i;
        }
        return multiplesOutput;
    }
    static public String stage1(int n){
        String output ="";
        for(int i =1;i<n;i++){
            output+=" "+checkMultiplesStage1(i)+",";
        }
        output+=checkMultiplesStage1(n);
        return output;
    }
    static private String checkMultiplesStage2(int i){
        String multiplesOutput = "";
        int[] numbers = {3,5,7,11};
        String[] words = {"Fizz","Buzz","Rizz","Jazz"};
        boolean divided=false;
        for(int k=0;k< numbers.length;k++){
            if(i%numbers[k]==0){
                divided=true;
                multiplesOutput+=words[k];
            }
        }
        if(!divided){
            multiplesOutput +=i;
        }
        return multiplesOutput;
    }
    static public String stage2(int n){
        String output ="";
        for(int i =1;i<n;i++){
            output+=" "+checkMultiplesStage2(i)+",";
        }
        output+=checkMultiplesStage2(n);
        return output;
    }
}
