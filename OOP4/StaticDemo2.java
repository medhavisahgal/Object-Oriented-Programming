package OOP4;

class Emp {
    private int age;
    private String name;
    private static String company = "ABC Pvt Ltd";

    public Emp(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void ShowCompany() {
        System.out.println("Company: " + company);
    }
}

public class StaticDemo2 {
    public static void main(String[] args) {
        Emp e1 = new Emp(25, "Alice");
        Emp e2 = new Emp(30, "Bob");
        Emp e3 = new Emp(35, "Charlie");
        // Static method can be used to access static variable
        Emp.ShowCompany();
        e1.display();
        e2.display();
        e3.display();

    }
}
