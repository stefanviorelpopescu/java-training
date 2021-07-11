import java.util.ArrayList;

public class MobilePhone implements Phone {

    private static ArrayList<Contacts> mycontacts;
    private static String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.mycontacts = new ArrayList<Contacts>();

    }
    @Override
    public void PrintList(){
        System.out.println("Print list");
        for(int i = 0;i < mycontacts.size(); i++) {
            Contacts contact = mycontacts.get(i);
            System.out.println(contact.getName() + "  " + contact.getNumber());
        }
    }
    @Override
    public boolean addNumber(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("exists");
            return false;
        } else {
            mycontacts.add(contact);
            return true;
        }
    }
    private int findContact(String name){
        for(int i = 0; i < this.mycontacts.size(); i++) {
            Contacts contact = mycontacts.get(i);
            if(contact.getName().equals(name))
                return i;
        }
        return -1;
    }

    @Override
    public void removeContact(String contact) {
        int foundposition=findContact(contact);
        if(foundposition == -1) {
            System.out.println("contact not found");
        }
        else {
            this.mycontacts.remove(foundposition);
        }
    }
}
