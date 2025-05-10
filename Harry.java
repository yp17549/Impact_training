
import java.util.Scanner;

public class Harry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a four digit number:");
        int a = sc.nextInt();
        int fd = a / 1000;
        int ld = a % 10;
        System.out.println(fd + ld);
    }
}
