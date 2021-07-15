public class VeganBurgerBuilder extends BurgerBuilder{

    private final Burger veganBurger;

    public VeganBurgerBuilder(){
        veganBurger = new Burger();
    }

    @Override
    public void addBread(String bread) {
        veganBurger.setBread(bread);
    }

    @Override
    public void addPatty(String patty) {
        veganBurger.setPatty(patty);
    }

    @Override
    public void addVeggies(String veggies) {
        veganBurger.setVeggies(veggies);
    }

    @Override
    public void addSauce(String sauce) {
        veganBurger.setSauces(sauce);
    }

    @Override
    public void addCheese(String cheese) {
        veganBurger.setCheese(cheese);
    }

    @Override
    public void addBacon() {
        veganBurger.setHasBacon(false);
    }

    @Override
    public void addExtraBacon() {
        veganBurger.setExtraBacon(false);
    }

    @Override
    public void addExtraCheese() {
        veganBurger.setExtraCheese(true);
    }

    public Burger getVeganBurger(){
        return this.veganBurger;
    }
}
