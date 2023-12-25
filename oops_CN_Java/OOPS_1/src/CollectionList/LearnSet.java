package CollectionList;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
//        Set<Integer> Linkedset=new LinkedHashSet<>(); It implements all properties of HashSet but in an order
//        Set<Integer> set=new TreeSet<>(); It implements all properties of set but in sorted form
        set.add(12);
        set.add(121);
        set.add(112);
        set.add(120);
        System.out.println(set);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to delete");
        int delete=sc.nextInt();
        set.remove(delete);
        System.out.println("Enter to check");
        int check=sc.nextInt();
        if(set.contains(check)){
            System.out.println(check+" is present");
        }else{
            System.out.println(check+" is not present");
        }
        System.out.println(set);

        Set<SetCustomEg> setCustom= new HashSet<>();
        setCustom.add(new SetCustomEg("Udbhav",20419));
        setCustom.add(new SetCustomEg("Anubha",20439));
        setCustom.add(new SetCustomEg("Shubham",20425));
        setCustom.add(new SetCustomEg("Satyam",20426));
        setCustom.add(new SetCustomEg("Aniket",20336));
        System.out.println(setCustom);
    }
}
