
import java.util.Date;

public abstract class MultiMediaItem extends Item{
    protected int Duration1;
    public MultiMediaItem(String Identification1, String Title1, Date AddedOn1, int Duration1){
        super(Identification1, Title1, AddedOn1);
        this.Identification = Identification1;
        this.Title = Title1;
        this.AddedOn = AddedOn1;
        this.Duration1 = Duration1;
    }
    public String toString(){
        return super.toString()+ ", Duration: "+ Duration1;
    }
}
