import java.util.Date;

public class Textbook extends Item {
    protected String Author;
    public Textbook(String Identification1, String Title1, Date AddedOn1, String Author1){
        super(Identification1, Title1, AddedOn1);
        this.Identification = Identification1;
        this.AddedOn = AddedOn1;
        this.Title = Title1;
        this.Author = Author1;

    }
    @Override
    public String toString(){
        return (Identification + " " + Title + " " + AddedOn + " " + Author);
    }
}
