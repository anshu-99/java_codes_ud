package Recursion;
import java.util.Scanner;
public class FactorialWithRecursion {
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        int smallOutput=Fact(n-1);
        return n*smallOutput;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for factorial");
        int num=sc.nextInt();
        System.out.println("Factorial= "+Fact(num));
    }
}
