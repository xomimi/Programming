// // Question no 3(b)
// import java.util.*;

// public class BellmanFordWithMaxHeap {
//     public static class Edge {
//         int source;
//         int target;
//         int weight;

//         public Edge(int source, int target, int weight) {
//             this.source = source;
//             this.target = target;
//             this.weight = weight;
//         }
//     }

//     public static void main(String[] args) {
//         int V = 5;
//         List<Edge>[] graph = new ArrayList[V];
//         for (int i = 0; i < V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         addEdge(graph, 0, 1, -1);
//         addEdge(graph, 0, 2, 4);
//         addEdge(graph, 1, 2, 3);
//         addEdge(graph, 1, 3, 2);
//         addEdge(graph, 1, 4, 2);
//         addEdge(graph, 3, 2, 5);
//         addEdge(graph, 3, 1, 1);
//         addEdge(graph, 4, 3, -3);

//         int source = 0;
//         int[] distances = bellmanFord(graph, V, source);
        
//         System.out.println("Shortest distances from source " + source + ":");
//         for (int i = 0; i < V; i++) {
//             System.out.println("Vertex " + i + ": " + distances[i]);
//         }
//     }

//     public static void addEdge(List<Edge>[] graph, int source, int target, int weight) {
//         graph[source].add(new Edge(source, target, weight));
//     }

//     public static int[] bellmanFord(List<Edge>[] graph, int V, int source) {
//         int[] distances = new int[V];
//         Arrays.fill(distances, Integer.MAX_VALUE);
//         distances[source] = 0;

//         PriorityQueue<Edge> maxHeap = new PriorityQueue<>(Comparator.comparingInt(edge -> -edge.weight));
//         maxHeap.add(new Edge(-1, source, 0)); // Dummy edge for source vertex

//         while (!maxHeap.isEmpty()) {
//             Edge edge = maxHeap.poll();
//             int u = edge.target;

//             if (edge.weight != distances[u]) {
//                 continue;
//             }

//             for (Edge neighbor : graph[u]) {
//                 int v = neighbor.target;
//                 int newDist = distances[u] + neighbor.weight;
//                 if (newDist < distances[v]) {
//                     distances[v] = newDist;
//                     maxHeap.add(new Edge(u, v, newDist));
//                 }
//             }
//         }

//         return distances;
//     }
// }
