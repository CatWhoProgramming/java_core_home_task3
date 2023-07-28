package Task3;

public class Plane extends Vehicle {
    private double price;
    private double speed;
    private int year;
    private double height;
    private int passengers;

    public Plane(double price, double speed, int year, double height, int passengers) {
        super(price, speed, year);
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.passengers = passengers;
    }

    void getParameters() {
        System.out.println("---------------------Plane--------------------------");
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
        System.out.println("Height: " + height);
        System.out.println("Passengers: " + passengers);
        System.out.println("-----------------------------------------------------");
    }
}
