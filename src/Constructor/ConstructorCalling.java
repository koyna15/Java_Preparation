package Constructor;

public class ConstructorCalling {
    String name;
    int reg;
    float marks;

    ConstructorCalling(String name, int reg, float marks){
        this.name = name;
        this.reg = reg;
        this.marks = marks;
    }
    ConstructorCalling(ConstructorCalling other){
        this.name = other.name;
        this.reg = other.reg;
        this.marks = other.marks;
    }

    public static void main(String[] args) {
        ConstructorCalling chicky = new ConstructorCalling("Chicky",123,89f);
        ConstructorCalling random = new ConstructorCalling(chicky);
        System.out.println(random.name);
        System.out.println(random.reg);
    }
}



