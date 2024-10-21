import java.util.*;
public class Q4_selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the seize of the array:");
        int s = sc.nextInt();
        int array [] = new int[s];
        System.out.println("Enter the seize of the array:");
        for(int i =0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Sorting the array:");
        for(int i = 0;i< array.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<array.length;j++){
                if(array[smallest]>array[j]){
                    smallest = j;
                }
                int temp = array[smallest];
                array[smallest] = array[i];
                array[i] = temp;

            }
            System.out.print(array[i]+" ");

        }
        sc.close();
    }
}
