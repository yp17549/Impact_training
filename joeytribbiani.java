
import java.util.Scanner;

public class joeytribbiani {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Three digit Number:");
        int a = sc.nextInt();
        if (a >= 100 && a <= 999) {
            int ld = a % 10;
            int md = (a % 100 - ld) / 10;
            if (md % 3 == 0) {
                System.out.println("Treandy number.");
            } else {
                System.out.println("Not A Treandy number.");
            }
        } else {
            System.out.println("Number invalid.");
        }
    }
}
