
import java.util.Scanner;

public class characternotpresent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder sl = new StringBuilder();
        for (int i = 0; i < b.length(); i++) {
            char d = b.charAt(i);
            if (a.indexOf(d) == -1) {
                sl.append(d);
            }
        }
        System.out.println(sl.toString());
    }
}
