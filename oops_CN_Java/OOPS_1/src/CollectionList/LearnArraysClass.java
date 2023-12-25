package CollectionList;
import java.util.Arrays;
import java.util.Scanner;

public class LearnArraysClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("enter to search");
        int n=sc.nextInt();
        int idx=Arrays.binarySearch(arr,n);
        System.out.println(n+" is present in "+idx+"th index");
//        Arrays.hashCode(arr);
    }
}
