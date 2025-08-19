package Functions;

public class Shadowing {
    static int x=90;
    //this will be shadowed at line 9.
    public static void main(String[] args) {
        //Shadowing in java: is a practise of using two variables with the same name within the scope that overlaps.
        System.out.println(x);
        int x=40; //40
        //scope will begin when value is initialized.
        // the class variable at line 4 is shadowed by this
        System.out.println(x);
        fun();
    }
    //the variable with the higher level scope is hidden
    static void fun(){
        System.out.println(x);
    }
}
