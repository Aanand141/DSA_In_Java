/*you have to print this pattern
   * * * * 
   * * * * 
   * * * * 
   * * * *
 */
public class Q1_rectangle_pattern {
    public static void main(String[] args) {
        int n = 4;//Number of rows
        int m = 5;//Number of columns
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
    
}
