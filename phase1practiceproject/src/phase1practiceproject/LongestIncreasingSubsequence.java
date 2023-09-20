package phase1practiceproject;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] lis = new int[n];
        Arrays.fill(lis, 1); // Initialize LIS values for each element to 1
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        
        int maxLIS = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLIS) {
                maxLIS = lis[i];
            }
        }
        
        System.out.println("Length of Longest Increasing Subsequence: " + maxLIS);
        System.out.print("Longest Increasing Subsequence: ");
        
        int[] subsequence = new int[maxLIS];
        int currentLength = maxLIS;
        
        for (int i = n - 1; i >= 0; i--) {
            if (lis[i] == currentLength) {
                subsequence[currentLength - 1] = arr[i];
                currentLength--;
            }
        }
        
        for (int i = 0; i < maxLIS; i++) {
            System.out.print(subsequence[i] + " ");
        }
        
        scanner.close();
    }
}