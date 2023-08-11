// // // Question no 2(a)
// public class LongestDecreasingSubsequence {
//     public static void main(String[] args) {
//         int[] nums = {8, 5, 4, 2, 1, 4, 3, 4, 3, 1, 15};
//         int k = 3;
//         int longestLength = longestDecreasingSubsequence(nums, k);
//         System.out.println("Longest subsequence length: " + longestLength);
//     }

//     public static int longestDecreasingSubsequence(int[] nums, int k) {
//         int n = nums.length;
        
//         // dp[i] stores the length of the longest decreasing subsequence ending at index i
//         int[] dp = new int[n];
//         dp[0] = 1; // Initialize the base case
        
//         int longestLength = 1; // Initialize the result
        
//         for (int i = 1; i < n; i++) {
//             dp[i] = 1; // Initialize for the current element
            
//             // Check previous elements for potential subsequences
//             for (int j = 0; j < i; j++) {
//                 // Check if the condition for the subsequence is met
//                 if (nums[i] + k < nums[j]) {
//                     dp[i] = Math.max(dp[i], dp[j] + 1);
//                 }
//             }
            
//             // Update the longestLength with the maximum value found so far
//             longestLength = Math.max(longestLength, dp[i]);
//         }
        
//         return longestLength;
//     }
// }

