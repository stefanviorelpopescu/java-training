public interface BasicInterface {
    public float getTripsLeft();

    public void validate() throws Exception;

    public void updateValid();

    public boolean isValid();

    public Basic create(String name);

    public String getStatus(); 

}
