package Functions;

public class ScopeInLoop {
    public static void main(String[] args) {
        for (int i=0;i<4;i++){
            System.out.println(i);
        }
        //System.out.println(i);//outside scope
    }
}
