package OOP5;

//Example of single inheritance 
class Vehicle {
    String brand;
    int speed;

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Vehicle accelerated to " + speed + " km/h");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class car extends Vehicle {
    int reverseGear;

    public void reverse() {
        System.out.println("Car is in reverse gear");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        car myCar = new car();
        myCar.brand = "Toyota";
        myCar.speed = 0;
        myCar.start();
        myCar.accelerate(50);
        myCar.reverse();
        myCar.displayInfo();
    }
}