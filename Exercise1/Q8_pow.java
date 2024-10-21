import java.util.*;
import java.math.*;
class formullah{
    public static double DisplayPower(double base, double exponent){
        return Math.pow(base, exponent);
    }
}
public class Q8_pow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        double base = sc.nextDouble();
        System.out.println("Enter the value of exponent: ");
        double exponent = sc.nextDouble();
        System.out.println("The power of "+base+" extends to "+exponent+" = "+formullah.DisplayPower(base, exponent));
    }
}
