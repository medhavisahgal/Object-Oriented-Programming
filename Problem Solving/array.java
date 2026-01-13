import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Array are fixed in size
        // To create a dynamic array we can use ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the number of elements to add in the dynamic array: ");
        int m = sc.nextInt();
        System.out.println("Enter the elements: ");
        // Normal way to add elements to ArrayList
        for (int i = 0; i < m; i++) {
            int ele = sc.nextInt();
            list.add(ele);
        }
        // Different way to add elements to ArrayList
        // index and value
        list.add(0, 100); // adds 100 at index 0
        list.add(2, 200); // adds 200 at index 2
        System.out.println("The elements in the dynamic array are: ");
        for (int i = 0; i < m; i++) {
            System.out.print(list.get(i) + " ");
        }
        // New way to iterate over ArrayList
        System.out.println("\nUsing for-each loop:");
        for (int x : list) {
            System.out.print(x + " ");
        }
        // Remove an element from ArrayList
        System.out.print("\nEnter the index to remove from the dynamic array: ");
        int rem = sc.nextInt();
        list.remove(rem);
        System.out.println("The elements in the dynamic array after removal are: ");
        for (int x : list) {
            System.out.print(x + " ");
        }
        // Get size of ArrayList
        System.out.println("\nSize of the dynamic array: " + list.size());
        // Check if ArrayList is empty
        System.out.println("Is the dynamic array empty? " + list.isEmpty());
        // Contains method
        System.out.print("Enter an element to check if it is present in the dynamic array: ");
        int check = sc.nextInt();
        // Sort the ArrayList
        Collections.sort(list);
        System.out.println("Sorted dynamic array: ");
        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Is " + check + " present in the dynamic array? " + list.contains(check));
        // Clear the ArrayList
        list.clear();
        System.out.println("Dynamic array cleared. Size now: " + list.size());
        // Note: ArrayList in Java is not synchronized. For synchronized version, use
        // Vector.
        sc.close();
    }

}
