package Functions;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="Kunal";
        //System.out.println(nums);
        //similarily "nums" cannot be accessed here.
        System.out.println(a);

        {
            a=100;
            //reassign the origin ref variable to some other value.
            //changes the value for block and outside this block.
            //int a=78;
            //cannot initialize the same variable again int the same function or block,but can change the value.
            int c=99;
            //if u create the value specifically for a block,it is only going to be used in that block.
            //values initialized in this block, will remain in this block.
            System.out.println(a);
            name="Chicky";
            System.out.println(name);
        }
        //System.out.println(c);
        //giving error, out of scope.
        System.out.println(name);
        int c=900;
    }

    static void random(){
        int nums=56;
        System.out.println(nums);
        //System.out.println(a);
        // a only be accesed in the main function, as it's scope is there only.
    }
}
//Anything initialized outside the block can be used inside the block.
//Anything initialized inside the block cannot be used outside the block.
//Anything initialized outside the block cannot be again initialized inside the block.
//Anything initialized inside the block can definitely be again initialized outside the block.