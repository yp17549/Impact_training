
import java.util.Scanner;

public class updownpyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (a - i); j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
