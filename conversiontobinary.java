
import java.util.Scanner;

public class conversiontobinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int rev = 0;
        while (a != 1) {
            int ftemp = a % 2;
            rev = rev * 10 + a;
        }
    }
}
