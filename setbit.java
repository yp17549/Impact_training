
import java.util.Scanner;

public class setbit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b > 0) {
            a = a / 10;
            b--;
        }
        a = a % 10;
        if (a == 1) {
            System.out.println(a + "Is a Set bit.");
        } else {
            System.out.println("It is not a set bit.");
        }
    }
}
