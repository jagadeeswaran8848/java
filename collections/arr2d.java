import java.util.Scanner;

public class arr2d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int[][] n = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            n[i] = new int[cols];

            System.out.print("Enter " + cols + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                n[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The 2D array entered by the user:");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
