import java.util.*;
import java.math.*;

class Funct {
    public static double FindCircumference(double r) {
        double p = Math.PI;
        double circumference = 2 * p * r;
        return circumference;
    }
}

public class Q4_radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r:");
        double r = sc.nextDouble();
        System.out.println("Circumference of the circle is: " + Funct.FindCircumference(r));
    }
}
