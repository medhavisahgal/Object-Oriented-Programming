package OOP3;

// Method Overloading
class Add {
    // Method Overloading: Same method name with different parameters
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }

    // changing the number of parameters also works
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // changing the order of parameters also works
    double add(int a, double b) {
        return a + b;
    }

}

public class AddDemo {
    public static void main(String[] args) {
        Add a1 = new Add();
        System.out.println(a1.add(10, 20));
        System.out.println(a1.add(11.5f, 20.5f));
        System.out.println(a1.add(10.5, 20.5));
        System.out.println(a1.add("Hello ", "World"));
        System.out.println(a1.add(10, 20, 30));
        System.out.println(a1.add(10, 20.5));
    }

}
