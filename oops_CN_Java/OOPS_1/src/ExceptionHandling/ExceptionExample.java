package ExceptionHandling;
import java.util.Scanner;
public class ExceptionExample {
    public static int Factorial(int n) throws NegativeNumberException{
        if(n<0){
            throw new NegativeNumberException();
        }
        int ans=1;
        for(int i=2;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
    public static int Divide(int a ,int b) throws DivideClassException{
        if(b==0) {
            throw new DivideClassException();
        }
        return a/b;
    }
    public static void main(String[] args) throws DivideClassException,NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int first = sc.nextInt();
        System.out.println("enter second number");
        int second = sc.nextInt();
        System.out.println("Enter num to find factorial");
        int num = sc.nextInt();
//        function exception
        try {
            System.out.println("Answer: " + (Divide(first, second)));
            System.out.println("Factorial: " + (Factorial(num)));
        } catch (DivideClassException e) {
            System.out.println("divide by zero exception raised");
        } catch (NegativeNumberException e) {
            System.out.println("Negative number exception raised");
        }
    }
}
