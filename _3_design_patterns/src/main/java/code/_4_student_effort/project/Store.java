package code._4_student_effort.project;

import java.util.ArrayList;
import java.util.List;


public class Store  {
    // Singleton
    public static Store obj = null;

    private List<Item> items;

    private Store() {
        items = new ArrayList<>();
        items.add(new Item("glasses",200.0,1));
        items.add(new Item("heel glasses",  50.0,2));
        items.add(new Item("napkin glasses",20.0,3));
        items.add(new Item("blue light goggles",250.0,4));
        items.add(new Item("Sunglasses",300.0,5));
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public  static Store getInstance(){
        if(obj == null){
            obj = new Store();
        }
        return obj;
    }
    @Override
    public String toString() {
        String str = "";
        for (Item item:items) {
            str += item.toString() + "\n";
        }
        return str;
    }

}
