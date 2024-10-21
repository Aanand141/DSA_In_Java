//Place Tiles of size 1 X m in a floor of size n X m;
public class Q12_PlaceTiles {
    public static int PlaceTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //Vertically Placement
        int verPlace = PlaceTiles(n-m, m);
        //Horizontally Placement
        int horPlace = PlaceTiles(n-1, m);

        return verPlace+horPlace;
    }
    public static void main(String[] args) {
        int n =3, m = 4;
        System.out.println(PlaceTiles(n, m));
    }
    
}
