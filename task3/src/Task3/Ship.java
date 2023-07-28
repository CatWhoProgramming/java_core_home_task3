package Task3;

public class Ship extends Vehicle {
    private double price;
    private double speed;
    private int year;
    private int passengers;
    private String port;

    public Ship(double price, double speed, int year, int passengers, String port) {
        super(price, speed, year);
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.passengers = passengers;
        this.port = port;
    }

    void getParameters() {
        System.out.println("---------------------Ship----------------------------");
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Year: " + year);
        System.out.println("Port: " + port);
        System.out.println("Passengers: " + passengers);
        System.out.println("-----------------------------------------------------");
    }
}
