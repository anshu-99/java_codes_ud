
package CollectionList;
import java.util.ArrayList;
import java.util.Scanner;

public class LearnArrayList {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<String> StudentName=new ArrayList<>();
        ArrayList<String> Course=new ArrayList<>();
//    add values
        StudentName.add("Udbhav Ojha");
        StudentName.add("Anubha Kumari");
        StudentName.add("Aniket Ojha");
        StudentName.add("Saurabh Kumar");
        StudentName.add("Satyam Kumar");

//        adding in course
        Course.add("MCA");
        Course.add("MBA");
        Course.add("M.Tech");
        Course.add("M.Ed");
        Course.add("MSC");

        System.out.println(StudentName);

//        adds into particular position
        StudentName.add(2,"Radhe Mohan");
        System.out.println(StudentName);

//        adds the whole list
        StudentName.addAll(Course);
        System.out.println(StudentName);
//        get() gets the value nd remove() removes it
        System.out.println("Give the name to remove");
        String str=sc.nextLine();
        for(int i=0;i<StudentName.size();i++){
            if(StudentName.get(i).equals(str)){
                StudentName.remove(i);
            }
        }
        System.out.println(StudentName);
//        set() for updation
        StudentName.set(6,"Shubham Kumar");
        System.out.println(StudentName);
    }
}
