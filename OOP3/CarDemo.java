package OOP3;

class Car {
    private void moveBreakPads() {
        System.out.println("Break pads are moving");
    }

    private void changePistonSpeed() {
        System.out.println("Piston speed is changing");
    }

    private void createSparks() {
        System.out.println("Sparks are created");
    }

    public void start() {
        createSparks();
        changePistonSpeed();
        moveBreakPads();
        System.out.println("Car has started");
    }

    public void stop() {
        moveBreakPads();
        System.out.println("Car has stopped");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.stop();
    }
}
