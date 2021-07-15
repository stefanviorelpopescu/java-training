public class OtherHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public void forwardMail(Email emailContent) {
        if (emailContent.getMailSubject().equalsIgnoreCase(Handler.OTHER_EMAIL)) {
            System.out.println("Email received it is not related to any filter.");
            System.out.println("Email will be sent to HR for analysis.");
        } else {
            this.next.forwardMail(emailContent);
        }
    }
}
