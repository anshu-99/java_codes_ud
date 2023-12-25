package Inheritence;

public class StudentClass extends ParentClass{
    String projectName;
    int cgpa;
     void CalculatePer(int cgpa){
        System.out.println("Percentage: "+(float)(cgpa)*(9.5));
    }
//     void Print(){
//        super.Print();
//        System.out.println("Child class called");
//    }
    public StudentClass(){
        System.out.println("child constructor called");
    }

    @Override
    public boolean isPlaced() {
        return true;
    }
}
