
import java.util.ArrayList;

public class Database {
    public ArrayList<Item> Item;

    public Database(){
        Item = new ArrayList<Item>();
    }
    public void list(){
        for(Item x : Item){
            System.out.println(x);
        }
    }
    public void addItem(Item object){
        Item.add(object);
    }
}
