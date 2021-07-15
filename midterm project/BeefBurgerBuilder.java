public class BeefBurgerBuilder extends BurgerBuilder {

    private final Burger beefBurger;

    public BeefBurgerBuilder() {
        this.beefBurger = new Burger();
    }

    @Override
    public void addBread(String bread) {
        beefBurger.setBread(bread);
    }

    @Override
    public void addPatty(String patty) {
        beefBurger.setPatty(patty);
    }

    @Override
    public void addVeggies(String veggies) {
        beefBurger.setVeggies(veggies);
    }

    @Override
    public void addSauce(String sauce) {
        beefBurger.setSauces(sauce);
    }

    @Override
    public void addCheese(String cheese) {
        beefBurger.setCheese(cheese);
    }

    @Override
    public void addBacon() {
        beefBurger.setHasBacon(true);
    }

    @Override
    public void addExtraBacon() {
        beefBurger.setExtraBacon(true);
    }

    @Override
    public void addExtraCheese() {
        beefBurger.setExtraCheese(true);
    }

    public Burger getBeefBurger() {
        return this.beefBurger;
    }

}
