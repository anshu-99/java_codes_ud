package CollectionList;

import java.util.*;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        System.out.println("enter element");
        for(int i = 0; i<5; i++){
            list.add(sc.nextInt());
        }
        System.out.println("minimum element is "+ Collections.min(list));
        System.out.println("maximum element is "+ Collections.max(list));
        System.out.println("enter to check frequency");
        int n= sc.nextInt();
        System.out.println("frequency of element is "+ Collections.frequency(list,n));
        Collections.sort(list);
        System.out.println(list);
    }
}
