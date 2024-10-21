import java.util.*;
/**
 * Q1_bubbleShort
 * 
 */
class DisplayArray{
    public static void formullah(int array[]){
    for(int i = 0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }

}
}
public class Q1_bubbleShort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seize of the array:");
        int seize = sc.nextInt();
        int array[] = new int[seize];
        System.out.println("Enter the element of the aray:"); 
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        //sorying of your given array
        for(int i = 0; i<array.length - 1 ;i++){
            for(int j = 0; j < array.length-i-1;j++){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                
            }
        }
        sc.close();
        System.out.println("Sorted array is:");
        DisplayArray.formullah(array);
    }
}