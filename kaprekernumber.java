
import java.util.Scanner;

public class kaprekernumber {

    static int reverse(int a) {
        int rev = 0;
        int count = 0;
        do {
            int r = a % 10;
            rev = (rev * 10 + r);
            a = a / 10;
            count++;
        } while (a != 0);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int b = 10;
        int fn = reverse(a);
        int final_no = a * a;
        if (fn % 2 == 0) {
            b = b * b;
            int ld = final_no % b;
            int fd = final_no / b;
            int full_final = fd + ld;
            if (full_final == a) {
                System.out.println(a + " is a Kaprekar Number.");
            } else {
                System.out.println(a + " is not a Kaprekar Numebr");
            }
        } else {
            b = b * b * b;
            int ld = final_no % b;
            int fd = final_no / b;
            int full_final = fd + ld;
            if (full_final == a) {
                System.out.println(a + " is a Kaprekar Number.");
            } else {
                System.out.println(a + " is not a Kaprekar Numebr");
            }
        }
    }
}
