package Genrics;

import Genrics.LinkedList;

public class LinkedListUse {
    public static LinkedList<Integer> create(){
        LinkedList<Integer> n1=new LinkedList<>(10);
        LinkedList<Integer> n2=new LinkedList<>(20);
        LinkedList<Integer> n3=new LinkedList<>(30);
        LinkedList<Integer> n4=new LinkedList<>(40);
        LinkedList<Integer> n5=new LinkedList<>(50);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        return n1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> head=create();
    }
}
