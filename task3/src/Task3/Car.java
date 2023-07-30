package Task3;

public class Car extends Vehicle {
    public Car(double price, double speed, int year) {

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
