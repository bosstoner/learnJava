import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Constructor
    Difference(int[] elements) {
        this.elements = elements;
    }

    // Compute the maximum absolute difference
    void computeDifference() {
        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        // Find the minimum and maximum elements in the array
        for (int element : elements) {
            if (element < minElement) {
                minElement = element;
            }
            if (element > maxElement) {
                maxElement = element;
            }
        }

        // Calculate the maximum difference
        maximumDifference = Math.abs(maxElement - minElement);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);
        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

