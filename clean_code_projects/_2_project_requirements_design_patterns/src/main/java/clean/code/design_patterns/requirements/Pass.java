import java.time.Duration;
import java.time.LocalDateTime;

public class Pass extends Basic{

    String name;
    long duration; //In hours
    LocalDateTime purchaseDate;

    Pass(String name, float fullPrice, long duration) {
        super(fullPrice);
        this.duration = duration;
        this.purchaseDate = LocalDateTime.now();
        this.name = name;
        
    }

    @Override
    public float getTripsLeft() {
        return Duration.between(this.purchaseDate, this.purchaseDate.plusHours(this.duration)).toHours();
    }

    @Override
    public void validate() throws Exception {
        if (isValid()){
        }
        else{
            throw new Exception("Invalid Pass.");
        }
        
    }

    @Override
    public void updateValid() {
        
    }

    @Override
    public boolean isValid() {    
        return this.purchaseDate.plusHours(this.duration).isAfter(LocalDateTime.now());
    }

    @Override
    public Basic create(String name) {
        return null;
    }

    @Override
    public String getStatus() {
        {
            return this.getClass().getName() + " full price: " + this.getFullPrice()
            + " discount price: " + this.getDiscountPrice() + " hours left: " + this.getTripsLeft();
        }
    }    
}
