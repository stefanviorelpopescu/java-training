package code._4_student_effort;

public class Challenge2 {
    public static String compute(int n)
    {
        String txt="";
        boolean status=false;
        if(n%3==0) {
            txt += "Foo";
            status = true;
        }
        if(n%5==0) {
            txt += "Bar";
            status = true;
        }
        if(n%7==0)
        {
            txt+="Qix";
            status=true;
        }
        String nr=Integer.toString(n);
        char[] digit=nr.toCharArray();
        for(int i=0;i< digit.length;i++)
        {
            if(digit[i]=='3') {
                txt += "Foo";
                status = true;
            }
            if(digit[i]=='5') {
                txt += "Bar";
                status = true;
            }
            if(digit[i]=='7') {
                txt += "Qix";
                status = true;
            }
        }
        if(status==false)
            txt=Integer.toString(n);
        return txt;
    }

    public static String compute2(int n)
    {
        String txt="";
        boolean status=false;
        if(n%3==0) {
            txt += "Foo";
            status = true;
        }
        if(n%5==0) {
            txt += "Bar";
            status = true;
        }
        if(n%7==0)
        {
            txt+="Qix";
            status=true;
        }
        String nr=Integer.toString(n);
        char[] digit=nr.toCharArray();
        for(int i=0;i< digit.length;i++)
        {
            if(digit[i]=='0') {
                txt += "*";
                status = true;
            }
            if(digit[i]=='3') {
                txt += "Foo";
                status = true;
            }
            if(digit[i]=='5') {
                txt += "Bar";
                status = true;
            }
            if(digit[i]=='7') {
                txt += "Qix";
                status = true;
            }
        }
        if(status==false)
            txt=Integer.toString(n);
        return txt;
    }

}
