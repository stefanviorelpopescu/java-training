package code._4_student_effort.challenge1;

public class Main {

  public static void main(String[] args) {
    ExchangeDesk exchangeDesk = new ExchangeDesk();
    Ron lei = new Ron(1_000);
    Usd dollar = exchangeDesk.convert(lei, Usd.class, 0.24);
    System.out.println(dollar.dollars());
  }
}
