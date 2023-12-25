package CodingCom;
import java.util.*;
public class ArrayPoint {
        public static void Input(int[] arr){
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        int[] arr1=new int[n];
        System.out.println("enter in first array");
        Input(arr);
        System.out.println("enter in second array");
        Input(arr1);
        int count=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr1[i]) {
                count++;
            }else if(arr[i]==arr1[i]){
                continue;
            }else{
                count1++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(count);
        ans.add(count1);
        System.out.println("Result:"+ans);
    }
}
