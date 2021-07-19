public class TokenFactory {
    public static Basic getToken(Basic f, String name){
        return f.create(name);
    }
    
}
