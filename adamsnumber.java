
import java.util.Scanner;

public class adamsnumber {

    static int reverse(int a) {
        int rev = 0;
        while (a != 0) {
            int r = a % 10;
            rev = (rev * 10 + r);
            a = a / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int a = sc.nextInt();
        int fn = a * a;
        int sn = reverse(a);
        sn = sn * sn;
        sn = reverse(sn);
        if (fn == sn) {
            System.out.println("Given number is a Adams Number.");
        } else {
            System.out.println("Given number is not a Adams Number");
        }
    }
}
