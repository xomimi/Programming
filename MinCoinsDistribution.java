// // Question no 1(b)

// import java.util.Arrays;

// public class MinCoinsDistribution {
//     public static void main(String[] args) {
//         int[] ratings = {1, 0, 2};
//         int minCoins = minCoinsDistribution(ratings);
//         System.out.println("Minimum number of coins: " + minCoins);
//     }

//     public static int minCoinsDistribution(int[] ratings) {
//         int n = ratings.length;
        
//         if (n == 0) {
//             return 0;
//         }

//         // Initialize an array to store the number of coins for each rider
//         int[] coins = new int[n];
//         Arrays.fill(coins, 1); // Initially assign 1 coin to each rider
        
//         // Traverse from left to right to make sure higher-rated riders have more coins than their left neighbors
//         for (int i = 1; i < n; i++) {
//             if (ratings[i] > ratings[i - 1]) {
//                 coins[i] = coins[i - 1] + 1;
//             }
//         }
        
//         // Traverse from right to left to make sure higher-rated riders have more coins than their right neighbors
//         for (int i = n - 2; i >= 0; i--) {
//             if (ratings[i] > ratings[i + 1]) {
//                 coins[i] = Math.max(coins[i], coins[i + 1] + 1);
//             }
//         }

//         // Calculate the total number of coins required
//         int totalCoins = 0;
//         for (int coin : coins) {
//             totalCoins += coin;
//         }

//         return totalCoins;
//     }
// }
