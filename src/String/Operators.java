package String;

import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//converts in ASCII value
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);//this is same as after a few steps : "a" +"1"
        //when an integer is concatenated with a string it is converted to its Integer wrapper class and its called toString()

        System.out.println("chicky" + new ArrayList<>());
        //System.out.println("chicky" + new Integer(56));
        /*System.out.println(new Integer(56) +""+ new ArrayList<>());
        //java "+" operator works with only primitives ans with all the complex objects as well but with
        //the only cond is one of these objects should be string */
        //String ans = new Integer(56) +""+ new ArrayList<>();
        //System.out.println(ans);

        System.out.println("a" +'b');




    }
}
