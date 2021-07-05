package code._4_student_effort._1_challengeOne;

public class Main {

    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        Ron lei = new Ron(1_000);
        Usd dollar = exchangeDesk.convert(lei, Usd.class, 0.25);
        System.out.println(dollar);

        Usd usd = new Usd(500);
        Ron ron = exchangeDesk.convert(usd, Ron.class, 4.1d);
        System.out.println(ron);
        
    }

}
