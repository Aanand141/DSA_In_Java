import java.util.*;
class formullah {
    public static Double DisplayFactorial(Double n) {
        double reul = 1;
        double i = 1;
        while (i <= n) {
            reul *= i;
            i++;
        }
        return reul;
    }
}

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            double n = sc.nextDouble();
            System.out.println("Factorial of " + n + " = " + formullah.DisplayFactorial(n));
        } finally {
            sc.close(); // Close the Scanner
        }
    }
}
