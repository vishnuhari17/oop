import java.util.Scanner;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int a[] = new int[10];
        int i, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Sort the first 'n' elements of the array
        Arrays.sort(a, 0, n);

        System.out.print("The sorted array is: ");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}
