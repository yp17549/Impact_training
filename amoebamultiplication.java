
import java.util.Scanner;

public class amoebamultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of months:");
        int count = sc.nextInt();
        System.out.println("The amoeba can grow up to:");
        int n1 = 0, n2 = 1;
        for (int i = 0; i < count; i++) {
            System.out.println(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }
}
