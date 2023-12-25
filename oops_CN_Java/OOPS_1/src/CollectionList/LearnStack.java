package CollectionList;
import java.util.Scanner;
import java.util.Stack;
public class LearnStack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        Stack= LIFO
        Stack<String> animals=new Stack<>();
//        add in stack using Push()
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Dog");
        animals.push("Cat");
        animals.push("Rhino");
        System.out.println(animals);
//        peak() to check top element of Stack
        System.out.println(animals.peek());

//        deletion
        animals.pop();
        System.out.println(animals);

//        delete random value
        System.out.println("Enter animals name to delete");
        String toBeDeleted=sc.nextLine();
        if(animals.contains(toBeDeleted)){
            animals.remove(toBeDeleted);
        }
        else{
            System.out.println(toBeDeleted+" is Not in the list");
        }
        System.out.println(animals);
        System.out.println("enter element to add");
        String newAnimal=sc.nextLine();
        animals.push(newAnimal);
        System.out.println("enter index and element");
        int index=sc.nextInt();
        String addNew=sc.nextLine();
        animals.add(index,addNew);
        System.out.println(animals);
    }
}