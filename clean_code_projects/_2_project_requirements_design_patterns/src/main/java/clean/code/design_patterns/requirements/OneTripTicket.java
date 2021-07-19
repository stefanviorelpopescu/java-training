public class OneTripTicket extends Ticket{

    OneTripTicket() {
        super(2.5f, 1, 1);
    }

    @Override
    public Basic create(String name) {
        return new OneTripTicket();
    }
    
}
