import java.util.ArrayList;
import java.util.List;

public class BoothProxy {
    public Booth booth;
    List<String> list=new ArrayList<String>();  

    public BoothProxy(){
        booth = new Booth();
    }

    public Basic getOneToken(Basic tokenType, Person person){
        try {
            Basic r = booth.getToken(tokenType, person.getName());
            System.out.println("name-> " + person.getClass().getName());
            System.out.println(this.list);
            if (list.contains(person.getClass().getName())){
                System.out.println("HERe");
                r.applyDiscount(person);
            }
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void addPerson(Person person){
        if (list.contains(person.getClass().getName()) == false){
            list.add(person.getClass().getName());
        }

        
    }
}
