public class DesignPattern2Main {
    private Handler chainOfResponsibility;

    public DesignPattern2Main() {
        this.chainOfResponsibility = new SpamHandler();

        Handler recruitingHandler = new RecruitingHandler();
        Handler complaintHandler = new ComplaintHandler();
        Handler businessHandler = new BusinessHandler();
        Handler otherHandler = new OtherHandler();

        chainOfResponsibility.setNext(recruitingHandler);
        recruitingHandler.setNext(complaintHandler);
        complaintHandler.setNext(businessHandler);
        businessHandler.setNext(otherHandler);

    }


    public static void main(String[] args) {

        DesignPattern2Main testChain = new DesignPattern2Main();

        testChain.chainOfResponsibility.forwardMail(new Email("Spam email"));
        testChain.chainOfResponsibility.forwardMail(new Email("Complaint email"));
        testChain.chainOfResponsibility.forwardMail(new Email("Other email"));
        testChain.chainOfResponsibility.forwardMail(new Email("Business email"));
        testChain.chainOfResponsibility.forwardMail(new Email("Recruiting email"));
    }
}
