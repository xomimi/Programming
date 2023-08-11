// // Question no:1(a)
// public class MinCostMatchingOutfits {
//     public static void main(String[] args) {
//         int[][] price = {{14, 4, 11}, {11, 14, 3}, {14, 2, 10}};
//         int minCost = minCostMatchingOutfits(price);
//         System.out.println("Minimum cost: " + minCost);
//     }

//     public static int minCostMatchingOutfits(int[][] price) {
//         int n = price.length;

//         // Initializing the minimum costs for each color for the first person
//         int minCost1 = price[0][0];
//         int minCost2 = price[0][1];
//         int minCost3 = price[0][2];

//         for (int i = 1; i < n; i++) {
//             // Calculate the minimum cost for the current person's outfit choices
//             int newMinCost1 = Math.min(minCost2, minCost3) + price[i][0];
//             int newMinCost2 = Math.min(minCost1, minCost3) + price[i][1];
//             int newMinCost3 = Math.min(minCost1, minCost2) + price[i][2];

//             // Update the minimum costs for the next iteration
//             minCost1 = newMinCost1;
//             minCost2 = newMinCost2;
//             minCost3 = newMinCost3;
//         }

//         // Return the minimum cost among the last person's outfit choices
//         return Math.min(minCost1, Math.min(minCost2, minCost3));
//     }
// }
