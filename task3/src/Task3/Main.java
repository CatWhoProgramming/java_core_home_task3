package Task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(40786, 250, 2005);
        car.getParameters();
        Plane plane = new Plane(200000, 1000, 2019, 2000, 56);
        plane.getParameters();
        Ship ship = new Ship(30000, 300, 2015, 45, "Odessa");
        ship.getParameters();

    }
}
