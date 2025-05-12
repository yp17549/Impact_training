
import java.util.Scanner;

public class MagicNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array (a):");
        int a = sc.nextInt();

        System.out.println("Enter a threshold value (z):");
        int z = sc.nextInt();

        int[] arr = new int[a];

        // Fill the array (example: user input)
        System.out.println("Enter " + a + " numbers for the array:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        // Example logic (adjust as needed)
        for (int i = 0; i < a; i++) {
            int x = 1;
            int y = arr.length; // or any other meaningful value

            while (x <= y) {
                if (x == arr[i]) {
                    // Do something (e.g., count occurrences)
                    System.out.println("Match found at index " + i);
                    break;
                } else if (z > arr[i]) {
                    y--; // Adjust y conditionally
                }
                x++; // Prevent infinite loop
            }
        }
    }
}
