import java.util.Scanner;

public interface SwapTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int Num1 = sc.nextInt();
        System.out.print("Enter Num2 : ");
        int Num2 = sc.nextInt();
        //SwapLogic

        Num1 = Num1 + Num2;
        Num2 = Num1 - Num2;
        Num1 = Num1 - Num2;
        System.out.println("After Swapping Num : "+Num1+","+Num2);

    }
}
