package code._3_in_class;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    System.out.println("Angajatul evaluat are " + Employee.daysOff + " zile de concediu disponibile.");
    Employee mariusGigicu = new Employee("Marius Gigicu");
/*    Employee.daysOff = 55;*/
    System.out.println("Numele angajatului este " + mariusGigicu.name + ".");
    System.out.println("Daca alege sa ii fie platit concediul, acesta trebuie sa primeasca: " + mariusGigicu.getHolidayPayment(50) + " lei.");
  }
}