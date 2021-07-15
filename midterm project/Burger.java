public class Burger {
    private String bread;
    private String patty;
    private String veggies;
    private String sauces;
    private String cheese;
    private boolean hasBacon;
    private boolean extraBacon;
    private boolean extraCheese;

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setVeggies(String veggies) {
        this.veggies = veggies;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setHasBacon(boolean hasBacon) {
        this.hasBacon = hasBacon;
    }

    public void setExtraBacon(boolean extraBacon) {
        this.extraBacon = extraBacon;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public String getBread() {
        return bread;
    }

    public String getPatty() {
        return patty;
    }

    public String getVeggies() {
        return veggies;
    }

    public String getSauces() {
        return sauces;
    }

    public String getCheese() {
        return cheese;
    }

    @Override
    public String toString() {
        if ("Beef".equals(this.patty)) {
            return "Beef Burger{" +
                    "bread='" + bread + '\'' +
                    ", patty='" + patty + '\'' +
                    ", veggies='" + veggies + '\'' +
                    ", sauces='" + sauces + '\'' +
                    ", cheese='" + cheese + '\'' +
                    ", hasBacon=" + hasBacon +
                    ", extraBacon=" + extraBacon +
                    ", extraCheese=" + extraCheese +
                    '}';
        } else if ("Veggie".equals(this.patty)) {
            return "Veggie Burger{" +
                    "bread='" + bread + '\'' +
                    ", patty='" + patty + '\'' +
                    ", veggies='" + veggies + '\'' +
                    ", sauces='" + sauces + '\'' +
                    ", cheese='" + cheese + '\'' +
                    ", hasBacon=" + hasBacon +
                    ", extraBacon=" + extraBacon +
                    ", extraCheese=" + extraCheese +
                    '}';
        } else {
            return "This type of burger is not a part of the restaurant menu.";
        }
    }
}
