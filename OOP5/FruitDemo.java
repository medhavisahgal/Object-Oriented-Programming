package OOP5;

// Example of hierarchical inheritance
class Fruit {
    String name;
    String color;

    void showType() {
        System.out.println("Fruit Type");
    }
}

class Apple extends Fruit {
    void showName() {
        System.out.println("Apple");
    }
}

class Banana extends Fruit {
    void showName() {
        System.out.println("Banana");
    }
}

class Mango extends Fruit {
    void showName() {
        System.out.println("Mango");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.name = "Apple";
        a.color = "Red";
        a.showType();
        a.showName();
        Mango m = new Mango();
        m.name = "Mango";
        m.color = "Yellow";
        m.showType();
        m.showName();
        Banana b = new Banana();
        b.name = "Banana";
        b.color = "Yellow";
        b.showType();
        b.showName();
    }
}
