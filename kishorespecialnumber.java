
import java.util.Scanner;

public class kishorespecialnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two digit First Number:");
        int a = sc.nextInt();
        System.out.println("Enter a Two digit Second Number:");
        int b = sc.nextInt();
        if (a >= 10 && b >= a && b <= 99) {
            for (int i = a; i >= a && i <= b; i++) {
                int fd = i / 10;
                int ld = i % 10;
                if (((fd + ld) + (fd * ld)) == i) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Invalid Number.");
        }
    }
}
