package Constructor;

public class Human {
    String name;
    int age;
    float height;

    Human(String name, int age, float height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    Human(){
        this("Default",20,165f);
    }
    public static void main(String[] args) {
        Human h = new Human("Kunal",24,167.89f);
        Human random = new Human();
        System.out.println(random.name);
        System.out.println(random.age);
    }
}
