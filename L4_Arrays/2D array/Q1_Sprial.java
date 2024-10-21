import java.util.*;
public class Q1_Sprial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column of the 2D array:");
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int arr[][] = new int[row][colm];
        System.out.println("Enter the elemnt of the array");
        for(int i = 0;i<row;i++){
            for(int j =0;j<colm;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Enterd array is:");
        for(int i = 0;i<row;i++){
            for(int j =0;j<colm;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}