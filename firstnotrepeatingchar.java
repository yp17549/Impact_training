
import java.util.Scanner;

public class firstnotrepeatingchar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(first(s));
    }

    static char first(String s) {
        String cha = "abcdaefghijklmnopqrstuvwxyzABCDEFGHIIJKLMNOPQRST";
        for (int i = 0; i < s.length(); i++) {
            char ch = cha.charAt(i);
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) != s.charAt(j)) {
                    if (s.indexOf(ch) == -1) {
                        return c;
                    }
                }
            }
        }
        return '\0';
    }
}
