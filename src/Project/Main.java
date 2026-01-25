package Project;

abstract class Result {
    abstract void calculateResult();
}
class Student extends Result{
    private int marks;

    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
    void calculateResult(){
        if(marks >= 30){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(80);
        System.out.println("Marks: "+ s.getMarks());
        s.calculateResult();
    }
}