import java.util.*;
public class Q2_replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str = sc.nextLine();
        String result = "";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result += 'i';
            }
            else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
