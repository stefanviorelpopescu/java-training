public class App {
    public static void main(String[] args) throws Exception {
        BoothProxy booth = BoothProxySingletonMetro.getMetroBooth();
        Student a = new Student("Ion");
        Adult b = new Adult("Catalin");
        booth.booth.load(new OneTripTicket(), 5);
        booth.booth.load(new TwoTripsTicket(), 5);
        booth.booth.load(new OneDayPass(""), 5);
        booth.booth.load(new OneWeekPass(""), 5);
        booth.addPerson(a);
        System.out.println(booth.booth.getLogger());
        Basic r = booth.getOneToken(new OneDayPass(a.getName()), a);
        Basic s = booth.getOneToken(new TwoTripsTicket(), a);
        Basic h = booth.getOneToken(new OneWeekPass(b.getName()), b);
        System.out.println(r.getStatus());
        System.out.println(s.getStatus());
        r.validate();
        s.validate();
        h.validate();
        System.out.println(r.getStatus());
        System.out.println(s.getStatus());
        System.out.println(h.getStatus());

        s.validate();
        System.out.println(s.getStatus());
        System.out.println(booth.booth.getLogger());
    }
}
