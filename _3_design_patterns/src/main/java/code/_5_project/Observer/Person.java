package code._5_project.Observer;



public class Person implements Observer {

    private String name;

    public Person(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println("Customer is interested in the product");
    }


}
