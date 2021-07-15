public class BusinessHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public void forwardMail(Email emailContent) {
        if (emailContent.getMailSubject().equalsIgnoreCase(Handler.BUSINESS_EMAIL)) {
            System.out.println("Email received is business related.");
            System.out.println("Forwarding email to business and development department.");
        } else {
            this.next.forwardMail(emailContent);
        }
    }
}
