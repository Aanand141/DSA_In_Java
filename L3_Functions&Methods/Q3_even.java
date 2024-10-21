import java.util.*;
class CheckEven{
    public static void EvenNumber(int n){
        int remainder = n%2;
        if(remainder!=0){
            System.err.println("the number is odd");
        }
        else{
            System.err.println("the number is even");
        }
    }
}
public class Q3_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        CheckEven.EvenNumber(n);
    }
}