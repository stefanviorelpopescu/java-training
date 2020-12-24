package code._4_student_effort.Project01;

import java.util.Scanner;

public class PizzaTest {
    public static void main(String[] args) {

        //BUILDER DESIGN PATTERN
        
        String dough,ingredient1,ingredient2,ingredient3,ingredient4,ingredient5;
        Scanner s = new Scanner(System.in);

        System.out.println("Dough: ");
        dough=s.nextLine();
        System.out.println("Ingredient1: ");
        ingredient1=s.nextLine();
        System.out.println("Ingredient2: ");
        ingredient2=s.nextLine();
        System.out.println("Ingredient3: ");
        ingredient3=s.nextLine();
        System.out.println("Ingredient4: ");
        ingredient4=s.nextLine();
        System.out.println("Ingredient5: ");
        ingredient5=s.nextLine();

        Pizza pizza = new Pizza.Builder(dough,ingredient1)
                .ingredient2(ingredient2)
                .ingredient3(ingredient3)
                .ingredient4(ingredient4)
                .ingredient5(ingredient5).build();
        System.out.println(pizza);
    }
}
