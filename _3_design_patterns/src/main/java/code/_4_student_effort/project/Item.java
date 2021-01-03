package code._4_student_effort.project;

public class Item {
    public String name;

    public double price;
    private int id;

    public Item (String name, double price, int id){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ' ';
    }
}
