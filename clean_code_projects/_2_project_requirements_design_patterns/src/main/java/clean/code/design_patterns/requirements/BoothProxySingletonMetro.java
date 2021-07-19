public class BoothProxySingletonMetro {
    private static BoothProxy boothProxy;

    private BoothProxySingletonMetro(){}

    public static BoothProxy getMetroBooth(){
        if(boothProxy == null){
            boothProxy = new BoothProxy();
        }
        return boothProxy;
    }
}
