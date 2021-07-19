import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Booth {
    HashMap<String, Integer> ticketsAndPassList = new HashMap<>();
    HashMap<LocalDateTime, String> logger = new HashMap<LocalDateTime, String>();

    protected Booth(){

    }

    protected void load(Basic token, int number){
        if (this.ticketsAndPassList.containsKey(token.getClass().getName())){
            Integer a = ticketsAndPassList.get(token.getClass().getName());
            a = a + number;
            //ticketsAndPassList.put(token, a);
            this.ticketsAndPassList.remove(token.getClass().getName());
            this.ticketsAndPassList.put(token.getClass().getName(), a);
        }
        else{
            this.ticketsAndPassList.put(token.getClass().getName(), number);
        }
        this.logger.put(LocalDateTime.now(), token.getClass().getName() + "+ " + number);
    }

    protected Basic getToken(Basic token, String name) throws Exception{
        if (this.ticketsAndPassList.containsKey(token.getClass().getName())){
            if (this.ticketsAndPassList.get(token.getClass().getName()) > 0){
                Integer a = this.ticketsAndPassList.get(token.getClass().getName());
                a = a - 1;
                this.ticketsAndPassList.put(token.getClass().getName(), a);   
                this.logger.put(LocalDateTime.now(), token.getClass().getName() + "- 1 ");
            }
        }
        else{
            throw new Exception("Booth does not have this kind of token.");
        }
        return TokenFactory.getToken(token, name);
    }
    protected HashMap<LocalDateTime, String> getLogger(){
        return this.logger;
    }


    public void saveBooth(Path path){
        try {
            FileOutputStream fileOut = new FileOutputStream(path.toFile());
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static Booth openBooth(Path path) throws ClassNotFoundException{
        try {
            FileInputStream fileIn = new FileInputStream(path.toFile());
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Booth t = (Booth) in.readObject();
            in.close();
            fileIn.close();
            return t;
         } catch (IOException i) {
            i.printStackTrace();
            return null;
         }
    }
}
