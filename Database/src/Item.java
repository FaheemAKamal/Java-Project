import java.util.Date;

public abstract class Item implements Comparable<Item>{
    public String Identification;
    public String Title;
    public Date AddedOn;

    public Item (String Identification1, String Title1, Date AddedOn1){
        this.Identification = Identification1;

        this.Title = Title1;
        this.AddedOn = AddedOn1;
    }

    public int compareTo(Item object){
        return Identification.compareTo(object.Identification);
    }
}
