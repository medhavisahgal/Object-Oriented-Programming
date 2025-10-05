package OOP5;

// Example of multilevel inheritance
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        puppy p = new puppy();
        p.eat();
        p.sleep();
        p.weep();
        p.bark();
    }
}