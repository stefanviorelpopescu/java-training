package code._4_student_effort.Project01;

public class MessageWriter implements Observer {
    @Override
    public void update(Message m) {
        System.out.println("NewMessage: " + m.getMessageContent());
    }
}
