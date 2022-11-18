import java.util.Scanner;
public class HarmonicNum {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Harmonic value : ");
    int N = sc.nextInt();
    float Harmonic = 1;
    if(N==0)
        System.out.println("not a valid harmonic number");
    // loop to apply the formula
    // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
    for(int i=2; i<N; i++){
        Harmonic+=(float)1/i;
    }
    System.out.println("Nth Harmonic Number : " + Harmonic);
}
}
