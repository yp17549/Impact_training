
import java.util.Scanner;

public class frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.next();
        System.out.println("Enter the character: ");
        char c = sc.next().charAt(0);
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (c == s.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
