import java.util.*;
public class Q3_BubbleShort {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the seize of the array:");
    int seize = sc.nextInt();
    int array[] = new int[seize];
    System.out.println("Enter the element of the array:");
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }
    System.out.println("Sorting the array: ");
    for(int i = 0 ;i <array.length-1;i++){
        for(int j =0;j<array.length-i-1;i++){
            if(array[j]>array[j+1]){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    System.out.println("the sorted array is:");
    for(int i = 0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
   } 
}
