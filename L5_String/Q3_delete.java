import java.util.*;
/**
 * Q3_delete
 */
public class Q3_delete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gmail:");
        String email = sc.nextLine();
        String UserName = "";
        for(int i =0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                UserName += email.charAt(i);
            }
        }
        System.out.println("UserName = "+UserName);
    }
}
