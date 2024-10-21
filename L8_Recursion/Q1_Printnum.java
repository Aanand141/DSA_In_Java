import java.util.*;
public class Q1_Printnum{
    public static void PrintNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintNum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        sc.close();
        PrintNum(n);
    }
}