package designPattern_1;

import java.util.Scanner;
//Am utilizat design patternul "Observer" care este un pattern comportamental si
// defineste o dependenta de "unul la mai multe" intre obiecte
//Proiectul are ca scop trimiterea notificarilor la useri
public class Main {

    public static void main(String[] args) {
        //creare subiect
        Notification notification = new Notification();

        //creare observatori
        Observer obj1 = new User("Roxana");
        Observer obj2 = new User("Alexandra");
        Observer obj3 = new User("Rares");

        //inregistrare observatori la subiect
        notification.register(obj1);
        notification.register(obj2);
        notification.register(obj3);

        //adauga useri la notificare
        obj1.setSubject(notification);
        obj2.setSubject(notification);
        obj3.setSubject(notification);

        //trimite notificarile
        obj1.update();

        while (true)
        {
            String notificationPost = "";
            System.out.println("Introduceti textul pentru notificare: ");
            Scanner input = new Scanner(System.in);
            notificationPost = input.nextLine();
            notification.postMessage(notificationPost);

        }


    }

}
