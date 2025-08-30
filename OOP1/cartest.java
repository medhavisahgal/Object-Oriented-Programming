
public class cartest {
    public static void main(String[] args) {
        car c1 = new car();
        c1.brand = "Toyota";
        c1.color = "Red";
        c1.speed = 0;
        c1.start();
        c1.accelerate();
        c1.stop();
    }
}

class car {
    // attributes
    String brand;
    String color;
    int speed;

    // methods
    void start() {
        System.out.println(brand + " " + color + " is starting.");
    }

    void accelerate() {
        speed += 10;
        System.out.println(brand + " " + color + " is accelerating. Speed: " + speed);
    }

    void stop() {
        speed = 0;
        System.out.println(brand + " " + color + " is stopped.");
    }

}
