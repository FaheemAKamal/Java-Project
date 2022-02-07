import java.util.Random;


public class Navigator {
    private int index;
    public Navigator(int N){

        this.index = N;
    }
    public void Navigate(BinomialNode treeroot){
        int Time = 0;
        Random random = new Random();
        float value = random.nextFloat();
        while(Time <= index){
            System.out.print(Time);
            if(value<= treeroot.Probability){treeroot = treeroot.upper; }
            else if(value<=treeroot.Probability) {treeroot = treeroot.lower;}
            else {treeroot = treeroot.lower;}
            Time++;
        }
    }
}
