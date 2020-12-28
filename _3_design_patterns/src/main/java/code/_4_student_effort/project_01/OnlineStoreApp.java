package code._4_student_effort.project_01;

import java.util.List;
import java.util.ArrayList;

public class OnlineStoreApp {

    // The only instance of the class - one instance of the game/application
    private static OnlineStoreApp onlineStoreApp = null;
    // Private constructor - to restrict instantiation of the class from other classes
    private OnlineStoreApp() { }

    // Products of the online store
    List<Product> products = new ArrayList<>();

    // The global access point for outer world
    public static OnlineStoreApp getInstance() {
        if (onlineStoreApp == null)
            onlineStoreApp = new OnlineStoreApp();
        return onlineStoreApp;
    }

    public void order(OrderingStrategy strategy) {
        strategy.doOrdering(this.products);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void clearProducts() {
        products.clear();
    }

    public void listProducts() {
        System.out.println(products);
    }

    @Override
    public String toString() {
        return "OnlineStoreApp{" +
                "products=" + products +
                '}';
    }
}
