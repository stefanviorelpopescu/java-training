package code._4_student_effort.Project01;

public class ObserverTest {
    public static void main(String[] args) {

        MessageWriter s1 = new MessageWriter();

        MessagePublisher p = new MessagePublisher();

        p.attach(s1);

        p.notifyUpdate(new Message("NEW! First Message"));  

        //p.detach(s1);

        p.notifyUpdate(new Message("NEW! Second Message"));
    }
}

