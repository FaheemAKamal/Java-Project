
public class BinomialTreeFactory {
    public static BinomialNode create(int Time, int Probability) {
        BinomialNode temporary = new BinomialNode();
        temporary.Probability = Probability;

        if (Time == 0) {
            return temporary;
        } else {
            temporary.upper = BinomialTreeFactory.create(Time-1,Probability);
            temporary.lower = BinomialTreeFactory.create(Time-1,Probability);
        }
        return temporary;
    }
}

