import java.util.*;
public class Q5_SetChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter your String");
	StringBuilder sb = new StringBuilder(sc.nextLine());
	System.out.println("Your string is :"+sb);
	sb.setCharAt(0,'A');
	System.out.println("Your string after change is :"+sb);
    }
}