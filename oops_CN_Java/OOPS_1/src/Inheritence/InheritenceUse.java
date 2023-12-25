package Inheritence;
import java.util.*;
public class InheritenceUse {
    public static void main(String[] args) {
        ParentClass prt;
        prt=new StudentClass();
        StudentClass std=new StudentClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String stuName=sc.nextLine();

        System.out.println("Enter UID:");
        String stuId=sc.nextLine();

        System.out.println("Course: ");
        String course=sc.nextLine();

        System.out.println("Enter Project Name: ");
        String project=sc.nextLine();

        prt.name=stuName;
        prt.course=course;
        prt.uid=stuId;
        std.projectName=project;
        std.cgpa=9;
        std.CalculatePer(std.cgpa);

        System.out.println("Name: "+stuName+" UID: "+stuId+" Course: "+std.course+" Project Name: "+project);
        StudentClass.PrintProtected();
        System.out.println("memory address of parent class: "+std+" and memory of parent class: "+prt);
//        std.Print();
        System.out.println("placed: "+prt.isPlaced());
    }
}
