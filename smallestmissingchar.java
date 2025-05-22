
import java.util.Scanner;

public class smallestmissingchar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String cha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIIJKLMNOPQRST";
        for (int i = 0; i < cha.length(); i++) {
            char ch = cha.charAt(i);
            if (s.indexOf(ch) == -1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
