//finding the sum of n number give by user
import java.util.*;
public class sum{
    public static void main(String args[]){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);

    }
}