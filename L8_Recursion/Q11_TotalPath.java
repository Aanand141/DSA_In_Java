import java.util.*;
public class Q11_TotalPath {
    public static int CountPath(int i,int j,int n,int m){
        if(i==n || j == m){
            return 0;
        }
        if(i==n-1 && j == m-1){
            return 1;
        }
        int doenpath = CountPath(i+1, j, n, m);
        int rightPath = CountPath(i, j+1, n, m);
        return doenpath+rightPath;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        sc.close();
        System.out.println("toal number of ways to rich in the last is :");
        System.out.println(CountPath(0, 0, n, m));
    }
}
