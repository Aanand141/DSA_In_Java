// /*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.
//  */
// /**
//  * Q1_calculator
//  */
// import java.util.*;
// public class Q1_calculator {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.println("Enter the operation (1 for +, 2 for -, 3 for *,4 for /,5 for %");
//         int key= sc.nextInt();
//         for(int i =0; i<=5;i++){
//             switch (key) {
//                 case 1:
//                     System.out.println(a+b);
//                     break;
//                 case 2:
//                      System.out.println(a-b);
//                      break;
//                 case 3:
//                     System.out.println(a*b);
//                     break;
    
//                     case 4:
//                      System.out.println(a/b);
//                      break;
//                 case 5:
//                     System.out.println(a%b);
//                     break;
//                 default:
//                     System.out.println("Please Enter the valid key");
//             }
//         }

//     }
// }
import java.util.Scanner;

public class  Q1_calculator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the number of operands: ");
        int n = scanner.nextInt();
        double result = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter operand " + (i + 1) + ": ");
            double num = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result += num;
                    break;
                case '-':
                    if (i == 0) {
                        result = num;
                    } else {
                        result -= num;
                    }
                    break;
                case '*':
                    if (i == 0) {
                        result = num;
                    } else {
                        result *= num;
                    }
                    break;
                case '/':
                    if (i == 0) {
                        result = num;
                    } else {
                        if (num != 0) {
                            result /= num;
                        } else {
                            System.out.println("Error! Dividing by zero is not allowed.");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please enter correct operator.");
                    return;
            }
        }

        System.out.println("The result is: " + result);
    }
}
