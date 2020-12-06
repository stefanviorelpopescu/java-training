package code._4_student_effort._3_challenge_proxy;



public class Main {
    //Declaration for text output color//
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CodeChallenge3(){
        Apartment app01 = new Apartment("Crangasi01", 300);
        Apartment app02 = new Apartment("Crangasi01", 600);
        Apartment app03 = new Apartment("Crangasi01", 350);
        Apartment app04 = new Apartment("Crangasi01", 400);
        Apartment app05 = new Apartment("Crangasi01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student ("Ionescu", 500);
        Student student02 = new Student ("Popescu", 330);
        Student student03 = new Student ("Popica", 600);
        Student student04 = new Student ("Marin", 400);
        Student student05 = new Student ("Nicolae Guta", 900);
        Student student06 = new Student ("George Boy", 666);
        Student student07 = new Student ("Florin Salam", 1200);
        Student student08 = new Student ("Carmen", 720);


        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);

        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);

        Apartment apartmentForStudent03 = proxy.rent(student03);
        System.out.println(student03 + " rented " + apartmentForStudent03);

        Apartment apartmentForStudent04 = proxy.rent(student04);
        System.out.println(student04 + " rented " + apartmentForStudent04);

        Apartment apartmentForStudent05 = proxy.rent(student05);
        System.out.println(student05 + " rented " + apartmentForStudent05);

        Apartment apartmentForStudent06 = proxy.rent(student06);
        System.out.println(student06 + " rented " + apartmentForStudent06);

        Apartment apartmentForStudent07 = proxy.rent(student07);
        System.out.println(student07 + " rented " + apartmentForStudent07);

        Apartment apartmentForStudent08 = proxy.rent(student08);
        System.out.println(student08 + " rented " + apartmentForStudent08);

    }

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 3 ----" + ANSI_RESET);
        CodeChallenge3();
    }
}
