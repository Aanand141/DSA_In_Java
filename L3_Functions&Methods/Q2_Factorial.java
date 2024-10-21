import java.util.*;
class Factorial{
    public static int FindFactorial(int n){
        int factorial = 1;
        if(n<1){
            System.out.println("plese enter the non negative number :");
            return 0;
        }
        for(int i = n ;i>=1;i--){
            factorial = factorial*i;
        }
        return factorial;
        
    }
}

public class Q2_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("factorial of n is :" + Factorial.FindFactorial(n));
    }
}
