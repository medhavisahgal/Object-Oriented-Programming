package OOP4;

class Demo {
    int a;
    static int b;
}

public class StaticDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        d1.a = 10;
        d2.a = 20;
        d3.a = 30;
        System.out.println("d1.a: " + d1.a + ",d2.a: " + d2.a + ",d3.a: " + d3.a); // 10
        Demo.b = 20;
        Demo.b = 30;
        Demo.b = 40;
        System.out.println("Demo.b: " + Demo.b); // 40
    }
}
