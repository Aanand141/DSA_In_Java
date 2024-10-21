/*Print this pattern
  1
  0 1
  1 0 1
  0 1 0 1
  1 0 1 0 1
 */
public class Q9_01pattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i =1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
