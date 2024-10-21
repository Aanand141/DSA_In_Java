import java.util.*;

/**
 * Q2_PrintNumAccen
 */
public class Q2_PrintNumAccen {
    public static void DisplayNum(int num){
        if(num <= 0){
            return;
        }
        DisplayNum(num-1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        System.out.print("The number between 1 to "+num+" are :");
        DisplayNum(num);
    }
}