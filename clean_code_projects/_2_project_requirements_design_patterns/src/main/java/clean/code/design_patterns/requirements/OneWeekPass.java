public class OneWeekPass extends Pass{

    OneWeekPass(String name) {
        super(name, 30, 168);
    }

    @Override
    public Basic create(String name) {
        return new OneWeekPass(name);
    }

    
}
