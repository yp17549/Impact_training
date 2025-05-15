
import java.util.Scanner;

public class addTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int arrres[] = new int[n + 1];
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int sum = arr1[i] + arr2[i] + carry;
            arrres[i + 1] = sum % 10;
            carry = sum / 10;
        }
        arrres[0] = carry;
        int start = arrres[0] == 0 ? 1 : 0;
        for (int i = start; i < arrres.length; i++) {
            System.out.print(arrres[i] + " ");
        }
    }
}
