package Class;
class Human1{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    Human1(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human1.population +=1;
    }
}
//public class Human {
//    public static void main(String[] args) {
//
//    }
//}
