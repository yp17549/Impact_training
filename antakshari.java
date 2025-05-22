
import java.util.Scanner;

public class antakshari {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String previous = sc.nextLine();
        String current = sc.nextLine();
        while (previous.charAt(previous.length() - 1) != current.charAt(1)) {
            if (previous.charAt(previous.length() - 1) == current.charAt(0)) {
                System.out.println(current);
                previous = current;
            } else {
                break;
            }
        }
    }
}
