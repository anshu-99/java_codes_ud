package StringFunction;
import java.util.*;

public class ReverseSentence {
    public static String Reverse(String S) {
        // input: This is a boy
        // output: yoba si s ihT
        StringBuffer sb= new StringBuffer(S);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(sb.toString().charAt(i)==' ') sb.toString().replaceAll(" ","aa");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence");
        String str = sc.nextLine();
        System.out.println("Ans:" + Reverse(str));
    }
}
