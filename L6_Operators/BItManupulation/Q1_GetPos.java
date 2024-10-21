//Q) Get the 3rd bit (podition=2) of a number n (n = 0101)
import java.util.*;
/**
 * Q1_GetPos
 */
public class Q1_GetPos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = 5;
        System.out.println("Enter the position :");    
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n) == 0){
            System.out.println("bit is zero");
        }
        else{
            System.out.println("bit is 1");
        }
    }
}