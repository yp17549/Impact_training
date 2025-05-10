
import java.util.Scanner;

public class evenorodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single digit Number:");
        int a = sc.nextInt();
        if (a <= 10) {
            if (a / 10 == 0) {
                System.out.println("It is an even Number.");
            } else if (a / 10 != 0) {
                System.out.println("It is an odd Number.");
            } else {
                System.out.println("It is a invalid Number.");
            }
        } else {
            System.out.println("It is not a single digit Number.");
        }
    }
}
