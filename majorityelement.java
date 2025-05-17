
import java.util.Scanner;

public class majorityelement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = arr[0];
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                c = arr[i];
                count = 1;
            } else if (arr[i] == c) {
                count++;
            } else {
                count--;
            }
        }
        if (count == 0) {
            System.out.println("Not having a majority element.");
        } else if (count == count) {
            System.out.println("Not having a majority element,Every element is similer.");
        } else {
            System.out.println(c);
        }
    }
}
