import java.util.*;
class formullah {
    public static void DisplayArray(int array[]){
        System.out.println("Sorted array is:");
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }
    }
}
public class secondMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seize of the array:");
        int s = sc.nextInt();
        int array[]= new int[s];
        System.err.println("Enter the element of the array:");
        for(int i = 0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        int temp;
        for(int i=s;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        formullah.DisplayArray(array);
    }
}
