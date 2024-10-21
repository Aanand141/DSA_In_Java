import java.util.*;

class CalculatorFunctions {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the value of a: ");
                int a = sc.nextInt();
                System.out.print("Enter the value of b: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The sum of a and b is: " + CalculatorFunctions.add(a, b));
                        break;
                    case 2:
                        System.out.println("The subtraction of a and b is: " + CalculatorFunctions.subtract(a, b));
                        break;
                    case 3:
                        System.out.println("The multiplication of a and b is: " + CalculatorFunctions.multiply(a, b));
                        break;
                    case 4:
                        System.out.println("The division of a and b is: " + CalculatorFunctions.divide(a, b));
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        System.out.println("Exiting the program. Goodbye!");
    }
}
