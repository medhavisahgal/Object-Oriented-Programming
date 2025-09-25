package OOP2;

class Student {
    private int roll_no;
    private String name;
    private double per;

    // setter method
    public void setData(int r, String s, double p) {
        roll_no = r;
        name = s;
        per = p;
    }

    // getter method(not exactly getter method but it is used to get data)
    public void showData() {
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + per);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData(101, "John Doe", 89.5);
        s.showData();
        Student p = new Student();
        p.setData(102, "Jane Smith", 92.3);
        p.showData();
    }
}