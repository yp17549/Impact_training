
import java.util.Scanner;

public class reverseupdownstaircase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= a - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
