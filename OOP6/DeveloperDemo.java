package OOP6;

// Example of method Overriding in Java
class FrontendDeveloper {
    void mySkill() {
        System.out.println("I know HTML, CSS, JavaScript");
    }
}

class FullStackDeveloper extends FrontendDeveloper {
    void mySkill() {
        super.mySkill(); // Call the method from FrontendDeveloper
        System.out.println("I know HTML, CSS, JavaScript, Java, SQL");
    }
}

public class DeveloperDemo {
    public static void main(String[] args) {
        FullStackDeveloper fsd = new FullStackDeveloper();
        fsd.mySkill();
    }
}
