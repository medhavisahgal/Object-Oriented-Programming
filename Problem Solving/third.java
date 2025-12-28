
import java.io.*;
import java.util.*;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String str = sc.nextLine();
        try {
            // Write the password in password.txt file;
            FileWriter fw = new FileWriter("password.txt");
            fw.write(str);
            fw.close();
            // Read the password from password.txt file
            BufferedReader br = new BufferedReader(new FileReader("password.txt"));
            String password = br.readLine();
            br.close();
            // Check if the password is strong
            int len = password.length();
            String strength;
            if (len <= 3) {
                strength = "Weak";
            } else if (len >= 4 && len <= 7) {
                strength = "Medium";
            } else {
                strength = "Strong";
            }
            // Write the strength in strength.txt file
            FileWriter fw2 = new FileWriter("strength.txt");
            fw2.write(strength);
            fw2.close();
            // Display the strength
            System.out.println("Password Strength: " + strength);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();
    }
}
