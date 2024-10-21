import java.util.*;
public class SumDigit { // Ensure filename matches class name
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("The sum of the digits of " + n + " = " + formullah.DisplaySumOfDigit(n));
    }
}

class formullah {
    public static int DisplaySumOfDigit(int n) { // Add public modifier
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}