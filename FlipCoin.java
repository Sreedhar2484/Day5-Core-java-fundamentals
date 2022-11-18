import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class FlipCoin{
    static int heads =0;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of flips :");
        int numOfFlips = sc.nextInt();
        if(numOfFlips<1){
            System.out.println("Not a valid number");
        }
        for(int i=0; i<numOfFlips; i++){
            double Random = Math.random();
            if(Random<0.5)
                System.out.println("Tails");
                
            else 
                System.out.println("Heads");
                heads++;  // count 
        }
        System.out.println("Percentage Of Heads : "+ (double)(heads/numOfFlips));
        System.out.println("Percentage Of Heads : "+ ((double)(numOfFlips-heads)/numOfFlips));
    }
}