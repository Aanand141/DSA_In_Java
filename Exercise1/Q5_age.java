import java.util.*;
class FindAge{
    public static void DisplayAge(int age){
        if(age>=18){
            System.out.println("Congrates!You are Eligible to Vote");
        }
        else{
            System.out.println("Your are under the age:");
        }
    }
}


public class Q5_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
        FindAge.DisplayAge(age);
    }
}
