
import java.util.Scanner;

public class stdInAndStdOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
    }
}
