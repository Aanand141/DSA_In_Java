 import java.util.*;
public class Q5_Fibonacci {
    public static void DisplayFibonacci(int a,int b,int n){
        if(n ==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        DisplayFibonacci(b, a+b, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term :");
        int n = sc.nextInt();
        int a=0,b=1;
        sc.close();
        System.out.print("Fibonacci series till "+n+"th term = ");
        DisplayFibonacci(a, b, n);


    }
    
}
