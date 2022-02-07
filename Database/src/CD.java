import java.util.Date;

public class CD extends MultiMediaItem{
    protected String Artist;
    public CD(String Identification1, String Title1,  Date AddedOn1, int Duration1, String Artist1){
        super(Identification1, Title1, AddedOn1, Duration1);
        this.Identification = Identification1;
        this.Title = Title1;
        this.AddedOn = AddedOn1;
        this.Duration1 = Duration1;
        this.Artist = Artist1;
    }
    @Override
    public String toString(){
        return (Identification + " " + Title + " " + Duration1 + " " + Artist);
    }
}

