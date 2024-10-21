import java.util.*;
import java.io.*;

class solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int term=a;
            for(int j = 0;j<n;j++){
                term+=(int)Math.pow(2,i)*b;
            }
            
        }
        in.close();
    }
}