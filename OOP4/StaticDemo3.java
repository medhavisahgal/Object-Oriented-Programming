package OOP4;

class Data {
    // In static block we can only access static members of the class
    // We cannot return any value from static block because it is not a method
    // We cannot use this or super keyword inside static block
    static {
        System.out.println("Static block is invoked");
    }
    static {
        System.out.println("Static block 2 is invoked");
    }

    public Data() {
        System.out.println("Constructor is invoked");
    }

    public static void Show() {
        System.out.println("show called...");
    }

    public void Display() {
        System.out.println("Display called...");
    }
}

public class StaticDemo3 {
    public static void main(String[] args) {
        Data.Show();
        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();
        d1.Display();
        d2.Display();
        d3.Display();
    }
}
// Static block is invoked only once when the class is loaded or we 1st create
// an object.
// We can have multiple static blocks in a class. They will be executed in the
// order they are defined in the class.