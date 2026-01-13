package OOP6;

// Example of method Overriding in Java
class FrontendDeveloper {
    void mySkill() {
        System.out.println("I know HTML, CSS, JavaScript");
    }
}

class FullStackDeveloper extends FrontendDeveloper {
    void mySkill() {
        // If we do not use super keyword here, it will call myskill method of
        // FullStackDeveloper class only and this will become a recursive call.
        // And here as it is calling a method its not necessary to write it as the first
        // statement.
        // This should only be the 1st statement when it calls the constructor of parent
        // class.
        // But it is a good practice to write it as the first statement.
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
