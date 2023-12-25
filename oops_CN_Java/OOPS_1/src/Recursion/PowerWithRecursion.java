package Recursion;
import java.util.Scanner;
public class PowerWithRecursion {
    public static int Pow(int n,int m){
        if(n==1 || m==0){
            return 1;
        }
        int smallOutput=Pow(n,m-1);
        return n*smallOutput;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base and power");
        int base=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println("Answer: "+Pow(base,pow));
    }
}
