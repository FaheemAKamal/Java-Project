import java.util.Date;

public class Video extends MultiMediaItem{
    protected String Director;
    public Video(String Identification1, String Title1, Date AddedOn1, int Duration1, String Director1){
        super(Identification1, Title1, AddedOn1, Duration1);
        this.Identification = Identification1;
        this.Title = Title1;
        this.AddedOn = AddedOn1;
        this.Duration1 = Duration1;
        this.Director = Director1;
    }
    @Override
    public String toString(){
        return (Identification + " " + Title + " " + AddedOn + " " + Duration1+ " " + Director);
    }
}
