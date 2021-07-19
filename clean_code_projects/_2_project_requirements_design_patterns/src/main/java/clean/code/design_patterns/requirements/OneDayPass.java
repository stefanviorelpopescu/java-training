public class OneDayPass extends Pass{

    OneDayPass(String name) {
        super(name, 8, 24);
        this.isValid = true;
    }

    @Override
    public Basic create(String name) {
        return new OneDayPass(name);
    }
    
}
