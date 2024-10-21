import java.util.*;
/**
 * Q1_String_Array
 */
public class Q1_String_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the string:");
        int seize = sc.nextInt();
        String arr[] = new String[seize];
        for(int i = 0;i<seize;i++){
            arr[i]=sc.nextLine();

        }
        System.out.println("The lenght of the string is:"+arr.length);
    }
}