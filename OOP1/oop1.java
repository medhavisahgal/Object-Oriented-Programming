import java.util.*;

public class oop1 {
    public static void main(String[] args) {
        Student[] s1 = new Student[5];
        // default values of array elements is null
        System.out.println(Arrays.toString(s1));
        // creating objects of Student class
        Student s2 = new Student();
        // default values of object attributes
        // rollno=0, name=null, marks=0.0
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        // assigning values to the attributes
        // s2.rollno = 101;
        // s2.name = "John";
        // s2.marks = 85.5f;
        // creating objects using parameterized constructor

    }

}

class Student {
    int rollno;
    String name;
    float marks;

    // default constructor
    // initializes attributes with default values
    // Student() {
    // this keyword refers to the current object
    // this.rollno = 0;
    // this.name = null;
    // this.marks = 0.0f;
    // }
    Student() {
        this.rollno = 101;
        this.name = "John";
        this.marks = 85.5f;
    }

    // parameterized constructor
    Student(int rno, String s, float m) {
        rollno = rno;
        name = s;
        marks = m;
    }

}