public class DesignPattern1Main {
    public static void main(String[] args) {
        BurgerRestaurant restaurant01 = new BurgerRestaurant();
        VeganBurgerBuilder veganChef = new VeganBurgerBuilder();
        restaurant01.setBuilder(veganChef);
        restaurant01.buildVeggieBurger("Brown Bread","Veggie","Pickles,Salad,Tomato,Avocado","All","Cheddar",true);
        Burger veganBurger = veganChef.getVeganBurger();
        System.out.println(veganBurger.toString());

        BeefBurgerBuilder beefChef = new BeefBurgerBuilder();
        restaurant01.setBuilder(beefChef);
        restaurant01.buildBeefBurger("Brown Bread","Beef","Pickles,Onion,Tomato,Salad","All","Cheddar",true,true,true);
        Burger beefBurger = beefChef.getBeefBurger();
        System.out.println(beefBurger);
    }
}
