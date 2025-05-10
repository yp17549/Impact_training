
import java.util.Scanner;

public class collatzsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of months:");
        int a = sc.nextInt();
        int count = 0;
        while (a != 1) {
            if (a % 2 == 0) {
                a = a / 2;
                System.out.print(a);
            } else {
                a = (3 * a) + 1;
                System.out.print(a);
            }
            System.out.print(a + "->");
            count++;
        }
        System.out.println("number of iteration:" + count);
    }
}
