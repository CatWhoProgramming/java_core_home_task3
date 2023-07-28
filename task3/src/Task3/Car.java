package Task3;

import javax.swing.plaf.IconUIResource;


public class Car extends Vehicle {
    private double price;
    private double speed;
    private int year;

    public Car(double price, double speed, int year) {
        super(price, speed, year);
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    void getParameters() {
        System.out.println("--------------------------Car-------------------------");
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
        System.out.println("------------------------------------------------------");
    }
}
