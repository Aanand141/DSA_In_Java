import java.util.Scanner;

public class butters {
    public static void drawButterflyPattern(int N) {
        int space = 2 * N - 1;
        int star = 0;

        for (int j = 1; j <= 2 * N - 1; j++) {
            if (j <= N) {
                space = space - 2;
                star++;
            } else {
                space = space + 2;
                star--;
            }

            // Print stars
            for (int m = 1; m <= star; m++) {
                System.out.print("*");
            }

            // Print spaces
            for (int n = 1; n <= space; n++) {
                System.out.print(" ");
            }

            // Print stars for special case
            for (int p = 1; p <= star; p++) {
                if (p != N) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int N = sc.nextInt();
        sc.close();

        drawButterflyPattern(N);
    }
}