import java.util.Scanner;
public class Factors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int N = sc.nextInt();
        int PrimeFactors = 0;
        for(int i=2; i*i<N; i++){
            while(N%i == 0) {
                System.out.println(i+" ");
                N = N/i;
             }
          }
          if(N >2) {
             System.out.println(N);
        }
    }
}
