import java.util.Scanner;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[6][6]; // Create a 2D array to store input

        // Read and populate the 2D array 'arr'
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxSum = findMaxHourglassSum(arr); // Find the max hourglass sum
        System.out.println(maxSum); // Print the result
        scanner.close();
    }

    // Method to calculate the hourglass sum for a specific hourglass
    public static int calculateHourglassSum(int[][] arr, int row, int col) {
        int sum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
                + arr[row + 1][col + 1]
                + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }

    // Method to find the maximum hourglass sum in the 2D array
    public static int findMaxHourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE; // Initialize max sum with a very small value

        // Iterate through the 2D array except for the border cells
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int currentSum = calculateHourglassSum(arr, i, j); // Calculate current hourglass sum
                maxSum = Math.max(maxSum, currentSum); // Update maxSum if needed
            }
        }

        return maxSum; // Return the maximum hourglass sum
    }
}

