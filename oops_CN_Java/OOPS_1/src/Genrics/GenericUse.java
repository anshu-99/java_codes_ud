package Genrics;

public class GenericUse {
    public static void main(String[] args) {
        FirstGenerics<String> obj = new FirstGenerics<String>();
        FirstGenerics<Integer> obj1 = new FirstGenerics<Integer>();
        FirstGenerics<Character> obj2 = new FirstGenerics<Character>();
        System.out.println(obj.Concat("Udbhav"," Ojha"));
        System.out.println(obj1.Concat(20,30));
        System.out.println(obj2.Concat('a','b'));
    }
}
