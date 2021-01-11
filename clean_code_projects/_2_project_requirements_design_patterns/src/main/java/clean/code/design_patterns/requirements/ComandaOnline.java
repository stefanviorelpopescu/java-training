package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class ComandaOnline {
    private Cozonac cozonac;
    private List<Observer> lista = new ArrayList<>();
    private String command_id;
    private String status;

    public ComandaOnline(Cozonac cozonac) {
        this.cozonac = cozonac;
    }

    public String getStatus() {
        return status;
    }

    public Cozonac getCozonac() {
        return cozonac;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyAllObservers();
    }

    public void notifyAllObservers(){
        for(Observer o : lista){
            o.update(this);
        }
    }

    public void attach(Observer observer){
        lista.add(observer);
    }
}
