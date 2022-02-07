import java.util.Comparator;


public class SortByDirector implements Comparator{
    @Override
    public int compare(Object one, Object two){
        if(one instanceof String && two instanceof String){
            String value1 = (String)one;
            String value2 = (String)two;
            if (value1 == null){
                return value1.compareTo(value2);
            }
            if (value2 == null){
                return value1.compareTo(value2);
            }
            return value1.compareTo(value2);
        }
        return 0;
    }
}
