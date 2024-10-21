import java.util.*;

class funct{
    public static int FindSum(int n){
        int sum =0;
        for(int i = 1; i<=n; i++){
            if(i % 2 != 0){
                sum+=i;
            }
           
        }
        return sum;
    }
}
public class Q2_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("The Sum of odd number is :"+funct.FindSum(n));
    }
    
}