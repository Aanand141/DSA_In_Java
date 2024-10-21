import java.util.*;

public class mutliplication {   
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("The multiplication of the "+num+" is:");
        int i = 0;
        while(i<=10){
            System.out.println(num +" * "+ i +" = "+num*i );
            i++;
        }
    }
}
