import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int iInner = 1; iInner <= N; iInner++) {
                System.err.print("*");

            }
            System.out.println();
        }
        sc.close();
    }
}
