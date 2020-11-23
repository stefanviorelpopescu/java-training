package code._4_student_effort;

public class Main {

  public static void codeChallenge1(){
    Fighter f1 = new Fighter("Doroftei",100,30);
    Fighter f2 = new Fighter("Rocky",100,35);
    BoxingMatch match=new BoxingMatch(f1,f2);
    System.out.println(match.fight());
  }

  public static void main(String[] args) {
    codeChallenge1();

  }
}
