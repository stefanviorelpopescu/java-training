package code._3_in_class;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    System.out.println(Employee.daysOff);
    Employee.daysOff = 25;
    Employee stefan = new Employee("Stefan");
    System.out.println("Holiday: " + stefan.getHolidayPayment(100));
  }
}