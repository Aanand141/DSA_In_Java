import java.util.*;

class FindAverage{
    public static int formullah(int a,int b, int c){
        int average = (a+b+c)/3;
        return average;
    }
}
public class Q1_average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("the average of  three numbers is :"+FindAverage.formullah(a, b, c));
    }
}