// // Question no 3 (a)
//  class MaximumTargetPoints {
//     public static void main(String[] args) {
//         int[] a = {3, 1, 5, 8};
//         int result = maxPoints(a);
//         System.out.println(result); // Output: 167
//     }

//     public static int maxPoints(int[] a) {
//         int n = a.length;
//         int[][] dp = new int[n][n];

//         // Initialize base cases: when only one target is considered
//         for (int i = 0; i < n; i++) {
//             dp[i][i] = a[i];
//             int prevValue = (i - 1 >= 0) ? a[i - 1] : 1;
//             int nextValue = (i + 1 < n) ? a[i + 1] : 1;
//             dp[i][i] = prevValue * a[i] * nextValue;
//         }

//         // Fill the dp array with optimal solutions
//         for (int len = 2; len <= n; len++) {
//             for (int left = 0; left <= n - len; left++) {
//                 int right = left + len - 1;
//                 dp[left][right] = 0;
//                 for (int k = left; k <= right; k++) {
//                     int leftValue = (left - 1 >= 0) ? a[left - 1] : 1;
//                     int rightValue = (right + 1 < n) ? a[right + 1] : 1;
//                     int currentPoints = a[k] * leftValue * rightValue;
//                     int leftPart = (k > left) ? dp[left][k - 1] : 0;
//                     int rightPart = (k < right) ? dp[k + 1][right] : 0;
//                     dp[left][right] = Math.max(dp[left][right], leftPart + currentPoints + rightPart);
//                 }
//             }
//         }

//         return dp[0][n - 1];
//     }
// }
