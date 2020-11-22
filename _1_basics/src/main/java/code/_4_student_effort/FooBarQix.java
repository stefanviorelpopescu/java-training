public class FooBarQix {
    public static void main(String[] args) {
        System.out.println(compute2(2806));
    }
    static String compute(Integer x){
        Integer z = 0;
        Integer y = x;
        while(x != 0){
            z = z * 10 + x % 10;
            x /= 10;
        }
        String str = "";
        if(y % 3 == 0)
            str += "Foo";
        if(y % 5 == 0)
            str += "Bar";
        if(y % 7 == 0)
            str += "Qix";
        while(z != 0){
            if(z % 10 == 3)
                str += "Foo";
            if(z % 10 == 5)
                str += "Bar";
            if(z % 10 == 7)
                str += "Qix";
            z /= 10;
        }
        if(str.equals(""))
            str += y.toString();
        return str;
    }

    static String compute2(Integer x){
        if(x == 0)
            return "*";
        Integer z = 0;
        Integer a = x;
        while(x != 0){
            z = z * 10 + x % 10;
            x /= 10;
        }
        Integer y = z;
        String str = "";
        if(a % 3 == 0)
            str += "Foo";
        if(a % 5 == 0)
            str += "Bar";
        if(a % 7 == 0)
            str += "Qix";

        boolean ok = false;
        while(z != 0){
            if(z % 10 == 3) {
                ok = true;
                break;
            }
            if(z % 10 == 5) {
                ok = true;
                break;
            }
            if(z % 10 == 7) {
                ok = true;
                break;
            }
            z /= 10;
        }
        z = y;
        if(!str.equals("") || ok == true){
            while(z != 0){
                if(z % 10 == 0)
                    str += "*";
                if(z % 10 == 3)
                    str += "Foo";
                if(z % 10 == 5)
                    str += "Bar";
                if(z % 10 == 7)
                    str += "Qix";
                z = z / 10;
            }
        }
        else {
            while (z != 0) {
                if (z % 10 == 0)
                    str += "*";
                else
                    str += z % 10;
                z = z / 10;
            }
        }

        return str;
    }
}
