package builderPattern;

public class Test {
    public static void main(String[] args){
        ShawarmaAndMenu firstCommand=new ShawarmaAndMenu.Builder(false).menu(true).wrap("Mare").meat("Amestec").sauces("Dulce-picant").build();
        System.out.println(firstCommand.getPrice());
        // daca trebuie sa fac sa afisez tot meniul sau cu ce a comandat te rog sa imi spui, nu e so hard dar sa imi spui daca trebuie:D
    }
}
