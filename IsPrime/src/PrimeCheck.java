/* Faheem Kamal */
import java.util.*;

public class PrimeCheck {

    public static void main(String args[]){
        int x = 0;
        int input = 0;
        int y = 2;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter a number to check for Prime: ");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        input = x;

        if(Prime(input)){
            System.out.println("Yes, it is a Prime Number.");
        }else{
            System.out.println("No, it is not a Prime Number.");
            while(x > 1){
                if(Prime(y)){
                    while(x%y == 0){
                        numbers.add(y);
                        x = x/y;
                    }
                }
                y = y + 1;
            }
            System.out.println("Prime factors of " + input + ":");
                for(y = 0; y<numbers.size();y++){
                    System.out.print(numbers.get(y)+ " ");
                }
        }
    }
    public static boolean Prime(int x){
        if(x <= 1){
            return false;
        }else if (x > 1){
            for (int k = 2; k < x; k++){
                if (x % k == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
