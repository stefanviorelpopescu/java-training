package code._4_student_effort.project_01;

public class ProductFactory {
    public static Product createProduct(Product.Type productType, Product.Size productSize, Product.Colour productColour) {
        switch (productType) {
            case Tshirt : return new Tshirt(productSize, productColour);
            case Shirt  : return new Shirt(productSize, productColour);
            case Blouse : return new Blouse(productSize, productColour);
            default     : System.out.println("No product was created! " + productType + " not added in the factory!");
        }
        throw new IllegalArgumentException("The product type " + productType + " is not recognized.");
    }
}
