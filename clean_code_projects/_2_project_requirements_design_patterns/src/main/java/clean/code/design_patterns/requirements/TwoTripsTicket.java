public class TwoTripsTicket extends Ticket{

    TwoTripsTicket() {
        super(5, 2, 2);
    }

    @Override
    public Basic create(String name) {
        return new TwoTripsTicket();
    }
    
}
