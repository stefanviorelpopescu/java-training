public class Ticket extends Basic{
    int numberOfTrips;
    int numberOfRemainingTrips;

    Ticket(float fullPrice, int numberOfTrips, int numberOfRemainingTrips) {
        super(fullPrice);
        this.numberOfRemainingTrips = numberOfRemainingTrips;
        this.numberOfTrips = numberOfTrips;
    }

    public int getNumberOfTrips() {
        return this.numberOfTrips;
    }

    @Override
    public float getTripsLeft() {
        return this.numberOfRemainingTrips;
    }

    @Override
    public void validate() throws Exception {
        if (isValid()){
            this.numberOfRemainingTrips--;
            if (isValid() == false){
                this.isValid = false;
            }
        }
        else{
            throw new Exception("Invalid Ticket.");
        }

        
        
    }

    @Override
    public void updateValid() {
        
    }

    @Override
    public boolean isValid() {
        if (this.numberOfRemainingTrips > 0){
            return true;
        }
        return false;
        
    }

    @Override
    public Basic create(String name) {
        return null;
    }  
    
    @Override
    public String getStatus() {
        {
            return this.getClass().getName() + " full price: " + this.getFullPrice()
            + " discount price: " + this.getDiscountPrice() + " trips left: " + this.getTripsLeft();
        }
    }    
}
