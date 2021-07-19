public abstract class Basic implements BasicInterface {
    float fullPrice;
    float discountPrice;
    boolean isValid; // True if ticket is valid, otherwise false

    Basic(float fullPrice) {
        this.fullPrice = fullPrice;
        this.discountPrice = fullPrice;
        this.isValid = true;
    }

    public float getFullPrice() {
        return this.fullPrice;
    }

    public float getDiscountPrice() {
        return this.discountPrice;
    }

    public boolean getIsValid() {
        return this.isValid;
    }

    public void applyDiscount(Person person) {
        this.discountPrice = (1 - (float)person.getDiscount() / 100) * this.fullPrice; 
    }

    

}
