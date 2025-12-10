public class first {
    public static void main(String[] args) {
        System.out.println("Hello World");// line break after hello world
        System.out.print("Hello world");// no line break after hello world
        // primitive data types in java
        int a = 10; // 4bytes [-2^31 to 2^31-1] or [-10^9 to 10^9]
        float b = 10.5f; // 4bytes [less precision]
        double c = 20.99; // 8bytes [more precision]
        char d = 'A'; // 2bytes [Unicode characters]
        boolean e = true; // 1byte [true or false]
        long f = 100000L; // 8bytes [-10^18 to 10^18]
        short g = 1000; // 2bytes [-32768 to 32767]
        byte h = 100; // 1byte [-128 to 127]
        // non-primitive data types in java
        String name = "John Doe"; // String is a class in java
        System.out.println(name);
    }
}
