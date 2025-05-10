
import java.util.Scanner;

public class sumofallthreedigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number:");
        int a = sc.nextInt();
        int fd = a / 100;
        int ld = a % 10;
        int md = (a % 100 - ld) / 10;
        System.out.println(fd + ld + md);
    }
}
