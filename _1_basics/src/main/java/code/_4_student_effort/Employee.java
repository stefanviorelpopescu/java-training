package code._4_student_effort;

public class Employee {
    static int daysOff = 21;
    String name;
    int getHolidayPayment (int amount){
        int extra = 100;
        return daysOff * amount + extra;
    }
    public Employee(String name){
        this.name=name;
    }
    public String name(){
        return "Numele e:" + name;
    }
    public String toString(){
        return name;
    }
    public static void main(String[] args) {
        System.out.println(daysOff);
        Employee oana = new Employee("Oana");
        System.out.println(oana);
        System.out.println(oana.getHolidayPayment(5));
    }

}


