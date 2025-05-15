
import java.util.Scanner;

public class weirdandnotweird {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            if (a == 0) {
                System.out.println("Weird");
            } else if (a <= 5) {
                System.out.println("Not Weird");
            } else if (a <= 20) {
                System.out.println("Weird");
            } else if (a >= 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Weird");
        }
    }
}
