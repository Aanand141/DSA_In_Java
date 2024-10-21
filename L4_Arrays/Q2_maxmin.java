import java.util.*;
public class Q2_maxmin{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seize of an arrray");
        int seize = sc.nextInt();
        int array[] = new int[seize];
        System.out.println("Enter the elent of the array:");
        for(int i=0;i<seize;i++){
            array[i]= sc.nextInt();
        }
        int max = array[0];
        for(int i=0;i<seize;i++){
             if (array[i]>max) {
                max = array[i];    
            }
        }
        System.out.println("THe largest number is :"+max);
    }
}