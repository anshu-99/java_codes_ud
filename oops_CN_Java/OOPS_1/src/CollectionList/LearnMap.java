package CollectionList;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, Integer> KeyValue= new TreeMap<>();

        KeyValue.put("A",1);
        KeyValue.put("B",2);
        KeyValue.put("C",3);
        KeyValue.put("D",4);
        KeyValue.put("E",5);
        System.out.println(KeyValue);
        KeyValue.putIfAbsent("Ten",10);
        System.out.println(KeyValue);

//        iteration
        for(Map.Entry<String,Integer> e:KeyValue.entrySet()){
            System.out.println(e.getKey()+" and "+e.getValue());
        }
//        iteration on keys
        for(String s:KeyValue.keySet()){
            System.out.println(s);
        }
//        iteration on values
        for(Integer i:KeyValue.values()){
            System.out.println(i);
        }
//        check the presented key
        Scanner sc = new Scanner(System.in);
        System.out.println("enter key to check");
        String name=sc.next();
        if(KeyValue.containsKey(name)){
            System.out.println(name+" is present");
        }
        System.out.println("enter value to check");
        int checkNum= sc.nextInt();
        if(KeyValue.containsValue(checkNum)){
            System.out.println(checkNum+" is present");
        }
    }
}
