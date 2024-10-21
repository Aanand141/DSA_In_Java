/*Print this pattern 
  1 2 3 4 5
  1 2 3 4 
  1 2 3
  1 2
  1
 */
public class Q7_inverted_halfpyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //second way to do this
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
