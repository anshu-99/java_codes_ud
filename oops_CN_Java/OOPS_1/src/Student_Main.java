import java.util.Scanner;

import static java.lang.System.out;

public class Student_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student std = new Student();
        out.println("Enter UID num");
        int uidNum = sc.nextInt();

        // Clear the input buffer (consume the newline character)
        sc.nextLine();

        out.println("Enter Name");
        String name = sc.nextLine();

        out.println("Enter email");
        String emailId = sc.nextLine();

        std.UID = uidNum;
        std.Name = name;
        std.email = emailId;

        out.println("UID Num: " + std.UID + " and Name: " + std.Name + " email-id entered: " + std.email);
        out.println("Memory of object: " + std);
        out.println("Number of students: " + Student.numStudents);
    }
}
