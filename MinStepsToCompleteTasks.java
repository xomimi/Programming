// // // Question no 4(a)
// import java.util.*;

// public class MinStepsToCompleteTasks {
//     public static void main(String[] args) {
//         int N = 3;
//         int[][] r = {{1, 3}, {2, 3}};
//         int minSteps = minStepsToCompleteTasks(N, r);
//         System.out.println("Minimum steps: " + minSteps);
//     }

//     public static int minStepsToCompleteTasks(int N, int[][] r) {
//         List<Integer>[] graph = new ArrayList[N + 1]; // 1-indexed graph
//         int[] indegree = new int[N + 1]; // In-degree of each node

//         for (int i = 1; i <= N; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         for (int[] relation : r) {
//             int x = relation[0];
//             int y = relation[1];
//             graph[x].add(y);
//             indegree[y]++;
//         }

//         Queue<Integer> queue = new LinkedList<>();
//         for (int i = 1; i <= N; i++) {
//             if (indegree[i] == 0) {
//                 queue.offer(i);
//             }
//         }

//         int steps = 0;
//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             for (int i = 0; i < size; i++) {
//                 int curr = queue.poll();
//                 for (int next : graph[curr]) {
//                     indegree[next]--;
//                     if (indegree[next] == 0) {
//                         queue.offer(next);
//                     }
//                 }
//             }
//             steps++;
//         }

//         return (steps == N) ? steps : -1; // Return -1 if there is a cycle (not all tasks can be completed)
//     }
// }
