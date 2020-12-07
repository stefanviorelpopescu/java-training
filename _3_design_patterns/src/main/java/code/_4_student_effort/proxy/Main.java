package code._4_student_effort.proxy;

public class Main {
    public static void main(String[] args){
        System.out.println("start!");
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

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);
        Student student03 = new Student("Mihalcea", 400);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudent02);
        Apartment apartmentForStudent03= proxy.rent(student03);
        System.out.println(student03 + " rented " + apartmentForStudent03);


    }
}

