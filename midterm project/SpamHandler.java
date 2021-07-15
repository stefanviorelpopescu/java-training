public class SpamHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler nextHandler) {
        this.next = nextHandler;
    }

    @Override
    public void forwardMail(Email emailContent) {
      if (emailContent.getMailSubject().equalsIgnoreCase(Handler.SPAM_EMAIL)){
          System.out.println("Email received it is a spam.Processing deleting operation.");
      }else {
          this.next.forwardMail(emailContent);
      }
    }
}
