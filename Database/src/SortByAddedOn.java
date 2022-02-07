import java.util.Comparator;
import java.util.Date;

public class SortByAddedOn implements Comparator {
    @Override
    public int compare(Object one, Object two){
        if(one instanceof Date && two instanceof Date){
            Date dvalue1 = (Date)one;
            Date dvalue2 = (Date)two;
            if (dvalue1 == null){
                return dvalue1.compareTo(dvalue2);
            }
            if (dvalue2 == null){
                return dvalue1.compareTo(dvalue2);
            }
            return dvalue1.compareTo(dvalue2);
        }
        return 0;
    }
}
