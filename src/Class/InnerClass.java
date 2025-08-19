package Class;
//outside classes cannot be static coz it is not itself dependent on any other class.
//but inner classes can static
public class InnerClass {
    //static inner class does not depend on objects of outside class but static inner class and main is dependent of each other.
    static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }
    }

//    class Test{
//        static String name;
//
//        public Test(String name){
//            Test.name = name;
//        }
//    }
    public static void main(String[] args) {
        Test a = new Test("Koyna");
        Test b = new Test("Chicky");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
//public class InnerClass {
//    public static void main(String[] args) {
//        Test a = new Test("Koyna");
//        Test b = new Test("Chicky");
//
//        System.out.println(a.name);
//        System.out.println(b.name);
//    }
//}

