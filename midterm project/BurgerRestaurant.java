public class BurgerRestaurant {
    private BurgerBuilder builder;

    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void buildVeggieBurger(String bread,String patty,String veggie,String sauce,String cheese,boolean extraCheese){
        this.builder.addBread(bread);
        this.builder.addPatty(patty);
        this.builder.addVeggies(veggie);
        this.builder.addSauce(sauce);
        this.builder.addCheese(cheese);
        if (extraCheese) {
            this.builder.addExtraCheese();
        }
    }

    public void buildBeefBurger(String bread,String patty,String veggie,String sauce,String cheese,boolean bacon,boolean extraBacon,boolean extraCheese){
        this.builder.addBread(bread);
        this.builder.addPatty(patty);
        this.builder.addVeggies(veggie);
        this.builder.addSauce(sauce);
        this.builder.addCheese(cheese);
        if (bacon) {
            this.builder.addBacon();
        }
        if (extraBacon){
            this.builder.addExtraBacon();
        }
        if (extraCheese) {
            this.builder.addExtraCheese();
        }
    }
}
