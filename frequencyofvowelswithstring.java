
import java.util.Scanner;

public class frequencyofvowelswithstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        String vowels = "aeiouAEIOU";
        char c;
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            c = s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No vowels present in the string.");
        } else {
            System.out.println(count);
        }
    }
}
