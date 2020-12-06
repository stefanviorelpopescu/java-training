package code._4_student_effort;

//import java.util.Arrays;

public class Main {
    //CODE CHALLENGE ONE
    /*
    public static void challenge1() {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
     */

    //CODE CHALLENGE TWO
    /*
    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void challenge2() {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy010Arr = Arrays.copyOf(arr, arr.length);
        Integer[] copy020Arr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSortStrategy(), copy010Arr);
        displaySorted(new MergeSortStrategy(), copy020Arr);
    }
     */

    //CODE CHALLENGE THREE
    /*
    public static void challenge3() {

        Apartament app01 = new Apartament("Crangasi01", 300);
        Apartament app02 = new Apartament("Crangasi01", 600);
        Apartament app03 = new Apartament("Crangasi01", 350);
        Apartament app04 = new Apartament("Crangasi01", 400);
        Apartament app05 = new Apartament("Crangasi01", 200);

        RealEstateProxy proxy = new RealEstateProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartament apartmentForStudent01 = proxy.rent(student01);
        //student02.name = "Albu";
        // if student02_name changes, he will received the next available apartment
        Apartament apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        System.out.println(student02 + " rented " + apartmentForStudent02);

    }
     */

    //CODE CHALLENGE FOUR
    /*
    static void challenge4() {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Popescu");
        Student s02 = new Student("Ionescu");
        Student s03 = new Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };
        for (String javaTopic : javaTopics) {
            teacher.teach(javaTopic);
        }
    }

     */

    //CODE CHALLENGE FIVE
    /*
    static void challenge5() {
        Integer[] arr = new Integer[]{12, 2, 5, 21, 13, 6, 19, 4, 1};
        Integer[] copy_1 = Arrays.copyOf(arr, arr.length);
        Integer[] copy_2 = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy_1);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy_2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy_1));
        System.out.println(Arrays.toString(copy_2));

    }
     */

    //CODE CHALLENGE SIX
    /*
    static void challenge6() {
        Person Me = new Person.Builder("Popa")
                .job("Football Analyst")
                .university("UTCN")
                .isMarried(false)
                .drivingLicense(false)
                .build();
        System.out.println(Me.toString());
    }
     */

    //CODE HARD_CHALLENGE ONE
    /*
    static void hardChallenge1() {
        DecorableTree decoratedTree = new ChristmasTree();

        decoratedTree = new Candy(1, decoratedTree);
        decoratedTree = new Garland(3, decoratedTree);
        decoratedTree = new Bulb(5, decoratedTree);
        decoratedTree = new Candy(7, decoratedTree);
        decoratedTree = new Garland(9, decoratedTree);

        decoratedTree.display();
    }
     */

    public static void main(String[] args) {
        //challenge1();
        //challenge2();
        //challenge3();
        //challenge4();
        //challenge5();
        //challenge6();
        //hardChallenge1();
    }
}
