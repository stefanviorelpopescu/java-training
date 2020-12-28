package code._4_student_effort.project_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static OnlineStoreApp onlineStoreApp = OnlineStoreApp.getInstance();

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Product p1 = ProductFactory.createProduct(Product.Type.Blouse, Product.Size.S, Product.Colour.Black);
        products.add(p1);
        Product p2 = ProductFactory.createProduct(Product.Type.Shirt, Product.Size.M, Product.Colour.White);
        products.add(p2);
        Product p3 = ProductFactory.createProduct(Product.Type.Shirt, Product.Size.S, Product.Colour.Black);
        products.add(p3);
        Product p4 = ProductFactory.createProduct(Product.Type.Tshirt, Product.Size.L, Product.Colour.Grey);
        products.add(p4);

        // Set products for the online store
        onlineStoreApp.setProducts(products);

        System.out.println("List products in descending order: ");
        onlineStoreApp.order(new DescendingPriceOrder());
        onlineStoreApp.listProducts();
        System.out.println("List products in ascending order: ");
        onlineStoreApp.order(new AscendingPriceOrder());
        onlineStoreApp.listProducts();
    }

}
