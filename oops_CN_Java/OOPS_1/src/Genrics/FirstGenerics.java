package Genrics;

public class FirstGenerics <T>{
    public T Concat(T a, T b){
        System.out.println(a+" "+b);
        return  a;
    }
}
