
import java.util.Scanner;

public class heightandweightproblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            a[i] = sc.nextInt();
        }
        int max_h = 0;
        int max_w = 0;
        int max_h_i = 0;
        int max_w_i = 0;
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0) {
                if (a[i] > max_h) {
                    max_h = a[i];
                    max_h_i = i;
                }
            } else {
                if (a[i] > max_w) {
                    max_w = a[i];
                    max_w_i = i;
                }
            }
        }
        System.out.println("maximum height: " + max_h);
        System.out.println("maximum weight: " + max_w);
        System.out.println("Person with maximum height: " + ((max_h_i / 2) + 1));
        System.out.println("Person with maximun weight: " + ((max_w_i / 2) + 1));
    }
}
