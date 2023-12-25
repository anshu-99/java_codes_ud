package Inheritence;
public abstract class ParentClass {
    String name;
    String course;
    String uid;
    static int numStudents;
//     void Print(){
//        System.out.println("Parent class called");
//    }

//    constructor
    public ParentClass(){
        System.out.println("parent class constructor");
        numStudents++;
    }
    protected static void PrintProtected(){
        System.out.println("protected class inherited within the child class");
    }
    public abstract boolean isPlaced();
}
