
import java.util.Scanner;

public class evenoroddadvance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single digit Number:");
        int a = sc.nextInt();
        if (a >= 2 && a <= 5) {
            if (a / 10 == 0) {
                System.out.println("Not Weird");
            } else if (a / 10 != 0) {
                System.out.println("Weird");
            } else {
                System.out.println("It is not a single digit Number.");
            }
        } else if (a >= 6 && a <= 20) {
            if (a / 10 == 0) {
                System.out.println("Weird.");
            } else if (a / 10 != 0) {
                System.out.println("Weird");
            } else {
                System.out.println("It is not a single digit Number.");
            }
        } else if (a >= 20) {
            System.out.println("Not Weird.");
        } else {
            if (a / 10 != 0) {
                System.out.println("Weird");
            } else {
                System.out.println("It is not a single digit Number.");
            }
        }
    }
}
