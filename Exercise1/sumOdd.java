import java.util.*;
class formullah {
    public static void DisplayOdd(int num) {
        int i = 0;
        System.out.print("The odd numbers between 0 to " + num + " are:");
        while (i < num) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
            i++;
        }
        System.out.println(); // Move to the next line after printing all odd numbers
    }

    public static int DisplaySumOfOdd(int num) {
        int sum = 0;
        int i = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}

public class sumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            formullah.DisplayOdd(num);
            System.out.println("The sum of odd numbers between 0 to " + num + " is: " + formullah.DisplaySumOfOdd(num));
        } finally {
            sc.close(); // Close the Scanner
        }
    }
}
