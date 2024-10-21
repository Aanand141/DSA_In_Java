import java.util.*;

public class Q4_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String sb = sc.nextLine();
        StringBuilder ab = new StringBuilder(sb);
        
        System.out.println("Enter your character:");
        char src = sc.next().charAt(0);
        
        boolean found = false;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == src) {
                System.out.println("Your char is present at index: " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Your element is not present");
        }
        
        System.out.println("Your String is: " + ab);
        for (int i = 0; i < ab.length(); i++) {
            System.out.println(ab.charAt(i));
        }
        
    }
}
