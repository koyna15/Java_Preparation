package Class;

public class Main {
    public static void main(String[] args) {
        Human1 chicky = new Human1(16,"Chicky",5000,false);
        Human1 suresh = new Human1(16,"Chicky",5000,false);
        Human1 mamta = new Human1(16,"Chicky",5000,false);
        Human1 akash = new Human1(16,"Chicky",5000,false);
        System.out.println(Human1.population);
    }

    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }
    void greeting(){
        System.out.println("Hello");
    }
}
/* non -static function can not be used inside static,but static method or variabl
can be used inside non-static.
non static in non static is fine */

