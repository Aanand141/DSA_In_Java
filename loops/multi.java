//finding the table of a given number;
import java.util.*;
public class multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(num +" * "+ i +" = "+num*i);
        }
    }
}
