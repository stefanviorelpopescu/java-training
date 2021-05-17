package code._4_student_effort;

public class FooBarQix {
    public static String compute(int i) {
        String sir = "";
        if (i % 3 == 0)
            sir+="Foo";
        if (i % 5 == 0)
            sir+="Bar";
        if (i % 7 == 0)
            sir+="Qix";
        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {
            if (digit == '3') sir += "Foo";
            if (digit == '5') sir += "Bar";
            if (digit == '7') sir += "Qix";
        }
        if(sir.isEmpty())
            sir= String.valueOf(i);

        return sir;
    }
    public static String compute2(int i) {
        String sir = "";
        boolean ok=false;
        if (i % 3 == 0) {
            sir += "Foo";
            ok = true;
        }
        if (i % 5 == 0){
            sir+="Bar";
            ok=true;}
        if (i % 7 == 0){
            sir+="Qix";
            ok=true;}
        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {
            if (digit == '3') sir += "Foo";
            else if (digit == '5') sir += "Bar";
            else if (digit == '7') sir += "Qix";
            else if (digit == '0') sir += "*";
            else if(ok==false)sir+=digit;
        }
        if(sir.isEmpty())
            sir= String.valueOf(i);

        return sir;
    }
    public static void main(String[] args) {
       // for(int i=0;i<=53;i++)
        System.out.println(compute2(10101));
    }
}
