package code._4_student_effort.anagram;

public class Main {

    public static void main (String[] args){
        anagrams("listen");
    }

    private static void anagrams(String str){
        permute(str,0,str.length()-1);
    }

    private static String swap(String str,int a,int b){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(a,a +1,""+str.charAt(b));
        stringBuilder.replace(b,b +1,""+str.charAt(a));
        return stringBuilder.toString();
    }

    private static void permute(String str, int l, int r)
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
}
