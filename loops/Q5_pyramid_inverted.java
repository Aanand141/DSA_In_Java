/*Print this pattern 
        *
      * *
    * * *
  * * * *

 */
public class Q5_pyramid_inverted {
   public static void main(String[] args) {
    int n = 4; // number of rows
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
   }    
}
