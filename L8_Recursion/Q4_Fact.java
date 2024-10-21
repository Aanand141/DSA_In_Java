import java.util.Scanner;

public class Q4_Fact {
    public static void DisplayFact(long n,long fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        DisplayFact(n-1, fact);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        long n = sc.nextInt();
        sc.close();
        long fact = 1;
        System.out.print("The factorial of the number "+n+"! = ");
        DisplayFact(n, fact);
    }
}
