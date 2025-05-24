
import java.util.Scanner;

public class twoddiagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int sum = 0;
        int[][] a = new int[s][s];
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i == j) {
                    sum += s[i][j];
                }
                sum += s[i][n - i - 1];
            }
        }
    }
}
