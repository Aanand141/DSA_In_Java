import java.util.*;
public class Q6_InsertChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Your String is :" + sb);
        sb.insert(0,'R');
        System.out.println("Your String is :"+sb);
        //Deleting the character
        sb.delete(2, 3);
        System.out.println("your deleted string is :"+sb);
        //Apending the character
        sb.append(" Pacahuri");
        System.out.println("Your character after apenfing is:"+sb);


    }
}