import java.util.*;

public class Q4_UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        System.out.println("Enter the bit 0/1 only");
        int oper = sc.nextInt();
        if (oper==1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
            
        }
        else{
            int BitMask = ~(bitMask);
            int newNumber = BitMask | n;
            System.out.println(newNumber);
        }
    }
    
}
