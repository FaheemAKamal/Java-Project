import java.util.*;


public class Demo {
    public static void main(String[] args) {
        int Time = 0;
        int Probability = 0;
        int index = 0;
        boolean isNumber;
        System.out.println("Finance Tree \n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element to insert for T");
        do{
            if(scanner.hasNextInt()){
                Time = scanner.nextInt();
                isNumber = true;
            }else{
                System.out.print("Wrong Input!");
                isNumber = false;
            }
        }while(!(isNumber));
        System.out.println(Time);

        System.out.print("Enter element for P: ");
        do{
            if(scanner.hasNextInt()){
                Probability = scanner.nextInt();
                isNumber = true;
            }else{
                System.out.print("Wrong Input!");
                isNumber = false;
            }
        }while(!(isNumber));
        System.out.println(Probability);

        System.out.print("Enter element for N: ");
        do{
            if(scanner.hasNextInt()){
                index = scanner.nextInt();
                isNumber = true;
            }else{
                System.out.print("Wrong Input!");
                isNumber = false;
            }
        }while(!(isNumber));
        System.out.println(index);

        BinomialNode treeroot = BinomialTreeFactory.create(Time,Probability);
        Navigator navigating = new Navigator(index);

        navigating.Navigate(treeroot);
    }
}
