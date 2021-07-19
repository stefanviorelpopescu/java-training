public class Person {
    String name;
    int discount;

    Person(String name, int discount){
        this.name = name;
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }
}
