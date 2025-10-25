/*একটা calculator বানাও যেখানে user add, subtract, multiply, divide — এই ৪টা অপশন বেছে নিতে পারবে।
প্রতিটা অপারেশন আলাদা method এ থাকবে।
User যতক্ষণ না “Exit” বেছে নেয়, ততক্ষণ প্রোগ্রাম চলবে।
📌 Topics: method, switch-case, loop
*/
import java.util.Scanner;

public class p34 {

    // Addition method
    static void add(double a, double b) {
        System.out.println("Result: " + (a + b));
    }

    // Subtraction method
    static void subtract(double a, double b) {
        System.out.println("Result: " + (a - b));
    }

    // Multiplication method
    static void multiply(double a, double b) {
        System.out.println("Result: " + (a * b));
    }

    // Division method
    static void divide(double a, double b) {
        if (b != 0)
            System.out.println("Result: " + (a / b));
        else
            System.out.println("Error: Division by zero is not allowed!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2;

        while (true) {
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    subtract(num1, num2);
                    break;
                case 3:
                    multiply(num1, num2);
                    break;
                case 4:
                    divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
