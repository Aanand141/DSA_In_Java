import java.util.*;

public class Q6_power {
    public static int DisplayPow(int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int num = x * DisplayPow(x, n-1);
        return num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int x = sc.nextInt();
        System.out.println("Enter the exponent :");
        int n = sc.nextInt();
        int result = DisplayPow(x, n);
        System.out.println("The result = "+result);
        sc.close();
    }
}
