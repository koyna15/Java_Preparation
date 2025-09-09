package Constructor;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(double side){
        this.w=side;
        this.h=side;
        this.l=side;
    }
    Box(double l, double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public static void main(String[] args) {
        System.out.println("Hiiii");
        Box b1 = new Box();
        b1.l = 9.8;
        System.out.println(b1.l);
        Box b2 = new Box(4.5,6.8,9.7);
        System.out.println(b2.l +" " + b2.h);
    }
}
