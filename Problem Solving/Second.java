public class Second {
    public static void main(String[] args) {
        // String - They are non-primitive data types in Java and are objects of the
        // String class.
        // Strings are used to store sequences of characters.
        // Strings are immutable, meaning once created, their values cannot be changed.
        String greeting = "Hello, World!";
        System.out.println(greeting);
        // Different methods of methods of String class
        System.out.println("Length of greeting: " + greeting.length());
        // Character at exact index
        System.out.println(greeting.charAt(2));
        // Substring from index 7 to end
        System.out.println(greeting.substring(7));
        // Substring from index 0 to 5 (5 not included)
        System.out.println(greeting.substring(0, 5));
        // Concatenation
        String name = "Alice";
        String welcomeMessage = greeting + " Welcome " + name + "!";
        System.out.println(name + name + name);
        System.out.println(welcomeMessage);
        // Replace
        String newgreeting = greeting.replace("World", "Java");
        System.out.println(newgreeting);
        // Convert to upper case
        System.out.println(greeting.toUpperCase());
        // Convert to lower case
        System.out.println(greeting.toLowerCase());
        // Trim whitespace
        String spacedString = "   Hello Java   ";
        System.out.println(spacedString.trim());

    }
}
