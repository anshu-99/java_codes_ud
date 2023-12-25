package CodingCom;
import java.util.*;

public class CodingComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter range");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                arr.add(i);
            }
        }
        System.out.println("Prime number up to "+range+": "+arr);

        for (Integer integer : arr) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(integer + " x " + i + " = " + integer * i);
            }
            System.out.println();
        }
    }
}
