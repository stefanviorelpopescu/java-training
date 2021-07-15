public interface Handler {
    String SPAM_EMAIL = "SPAM EMAIL";
    String RECRUITING_EMAIL = "RECRUITING EMAIL";
    String COMPLAINT_EMAIL = "COMPLAINT EMAIL";
    String BUSINESS_EMAIL = "BUSINESS EMAIL";
    String OTHER_EMAIL = "OTHER EMAIL";

    void setNext(Handler nextHandler);

    void forwardMail(Email emailContent);
}
