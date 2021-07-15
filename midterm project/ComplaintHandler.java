public class ComplaintHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public void forwardMail(Email emailContent) {
        if (emailContent.getMailSubject().equalsIgnoreCase(Handler.COMPLAINT_EMAIL)) {
            System.out.println("Email received is a complain.");
            System.out.println("Forwarding email to legal department.");
        } else {
            this.next.forwardMail(emailContent);
        }
    }
}
