//Functions and Methods
//Progeammer : Prakash kumar Pacahuri 
// Date:

import java.util.*;

class Functions {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        if (a < b) {
            return b - a;
        } else {
            return a - b;
        }

    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int devide(int a, int b) {
        if (a > b) {
            return a / b;
        } else {
            return b / a;
        }

    }
}

public class Q1_calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("******Menu******");
            System.out.println("1.add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Devide");
            System.out.println("5.Exit");
            choice = sc .nextInt();
            if(choice>=1 && choice<=4){
                System.out.println("Enter the value of  a and b");
                int a = sc.nextInt();
                int b = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The sum of a and b is :" + Functions.add(a, b));
                        break;
                
                    case 2:
                        System.out.println("The subtraction of a and b is :" + Functions.sub(a, b));
                        break;
                    case 3:
                        System.out.println("The multiplication of a and b is :" + Functions.add(a, b));
                        break;
                    case 4:
                        System.out.println("The devision of a and b is :" + Functions.add(a, b));
                        break;
                }
       
            }
            else if(choice != 5){
                System.out.println("Invalid choice !@ Please try again");
            }
         }
         while(choice != 5);
         System.out.println("Exiting the program. Goodbye!");

}
}