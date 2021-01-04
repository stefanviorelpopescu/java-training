package code._5_project.Observer;

/*There is a shop and lets say that a product might have caught the attention of a customer, but the item is out of stock, but it might return
soon. The problem is, if the client wants to know any news about the product, he has to come repeatedly at the shop to check if the product is back.
The client would waste a lot of time in checking for any update coming repeatdly at the shop.
The problem can be solved by sending a notification to the interested customers that have subscribed to the shop's newsletter whenever
there's news about the product. As soon as the item is
back in stock, the shop would send an email to the subscribers notifying them about it*/

public class Main {
    public static void main(String[] args){
        Shop shop=new Shop();
        Person p1=new Person("Lili");
        Person p2=new Person("Lala");
        shop.registerObserver(p1);
        shop.registerObserver(p2);
        shop.notifyObservers();

    }
}
