import java.util.*;

public class PairSum {

    // Method to find the number of pairs whose sum equals target
    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        // Iterate over all pairs in the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Prompt for array elements
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Prompt for target sum
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        // Call pairSum method and print result
        System.out.println("Number of pairs: " + pairSum(arr, target));
    }
}
