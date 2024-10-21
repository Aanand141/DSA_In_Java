import java.util.*;
public class Q7_PoweLog {
    public static int DisplayPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n%2 == 0){
            return DisplayPow(x, n/2) * DisplayPow(x, n/2);
        }
        else{
            return x * DisplayPow(x, n/2) * DisplayPow(x, n/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int x = sc.nextInt();
        System.out.println("Enter the exponent :");
        int n = sc.nextInt();
        int result = DisplayPow(x, n);
        System.out.println("The value of "+x+" to the power "+n+" = "+result);
        sc.close();

    }
    
}
