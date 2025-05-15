
import java.util.*;

public class stdInAndStdOutII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();

        String c = sc.nextLine();

        sc.close();
        System.out.println("String:" + c);
        System.out.println("Double:" + b);
        System.out.println("Int:" + a);
    }
}
