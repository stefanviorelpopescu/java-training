package code._4_student_effort.DPproject2;

public class clientMenu {

    public static void main(String[] args) {
        coffeCapsule p = new coffeCapsule();
        String coffecapsule = p.makeCoffe();
        System.out.println(coffecapsule);

        //Preparing short coffe
        String shortCoffe = new shortCoffe(p).makeCoffe();
        System.out.println(shortCoffe);

        //Preparing long coffe
        String longCoffe = new longCoffe(p).makeCoffe();
        System.out.println(longCoffe);

        //Preparing caffeLatte
        String caffeLatte = new caffeLatte(p).makeCoffe();
        System.out.println(caffeLatte);


    }


}
