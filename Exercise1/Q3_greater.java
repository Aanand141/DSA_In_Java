import java.util.Scanner;

class Funct {
    public static int FindGreater(int a, int b) {
        int greater;
        if (a > b) {
            greater = a;
        } else {
            greater = b;
        }
        return greater;
    }
}

public class Q3_greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greater number is: " + Funct.FindGreater(a, b));
    }
}
