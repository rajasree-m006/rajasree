import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
         int m = in.nextInt(); // column
        int[][] arr = new int[n][m];
        
        // Input loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        // Output loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // Tip: This should likely be j < m
                System.out.print(arr[i][j] + " ");
            }
        System.out.println();
        
        }
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            totalSum += arr[i][j]; // Adds every number to totalSum
        }
        }
        System.out.println("Total Sum: " + totalSum);
        in.close();

    }
}
