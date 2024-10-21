import java.util.*;
/**
 * Q3_SumN
 */
public class Q3_SumN {
    public static void DisplaySum(int n, int sum){
        if(n==0){
            System.out.println(sum); 
            return;
        }
        sum += n;
        DisplaySum(n-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the sum:");
        int n = sc.nextInt();
        int sum = 0;
        sc.close();
        DisplaySum(n, sum);
    }
}