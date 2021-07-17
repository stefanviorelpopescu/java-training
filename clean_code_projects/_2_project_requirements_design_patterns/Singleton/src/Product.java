public class Product {
    private int id;
    private String name;

    @Override
    public String toString() {
        return name ;
    }
    public Product(){

    }
    public Product(int id, String name){
        this.id=id;
        this.name=name;

    }
    public int getId(){

        return id;
    }
    public String getName(){

        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }
}