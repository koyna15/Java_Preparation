package Constructor;

public class Student {
    String name;
    int reg;
    float marks;

    Student(){
        name = "Sana";
        reg = 123;
        marks = 89f;
    }
    void display(){
        System.out.println(name);
        System.out.println(reg);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
