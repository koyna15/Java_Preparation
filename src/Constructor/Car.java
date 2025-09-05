package Constructor;

public class Car {
    String name;
    float price;
    String fuel;

    Car(String name, float price, String fuel){
        this.name = name;
        this.price = price;
        this.fuel = fuel;
        System.out.println(name);
        System.out.println(price);
        System.out.println(fuel);
    }

    public static void main(String[] args) {
        Car maruti = new Car("Maruti",500000.00f,"Petrol");
        Car xuv = new Car("XUV700",1700000.00f,"Diesel");
    }
}
