public class RecruitingHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public void forwardMail(Email emailContent) {
        if (emailContent.getMailSubject().equalsIgnoreCase(Handler.RECRUITING_EMAIL)) {
            System.out.println("Email received it is about job recruiting.");
            System.out.println("Email will be forwarded to recruitment department.");
        } else {
            this.next.forwardMail(emailContent);
        }
    }
}
