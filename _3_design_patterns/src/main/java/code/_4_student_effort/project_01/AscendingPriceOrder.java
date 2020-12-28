package code._4_student_effort.project_01;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AscendingPriceOrder implements OrderingStrategy {

    @Override
    public void doOrdering(List<Product> products) {
        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2){
                if(p1.getPrice() == p2.getPrice())
                    return 0;
                return p1.getPrice() < p2.getPrice() ? -1 : 1;
            }
        });
    }

}
