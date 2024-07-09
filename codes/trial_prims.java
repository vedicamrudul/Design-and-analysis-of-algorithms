package codes;
import java.util.*;

public class trial_prims {
    static class Edge {
        int source, destination, weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static int[] Dijkstra(Edge[] edges, int V, int source) {
        int[] distance = new int[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] node = pq.poll();
            int u = node[0];
            int distU = node[1];

            if (distU > distance[u]) continue;

            for (Edge edge : edges) {
                if (edge.source == u) {
                    int v = edge.destination;
                    int weight = edge.weight;

                    if (distance[u] + weight < distance[v]) {
                        distance[v] = distance[u] + weight;
                        pq.add(new int[]{v, distance[v]});
                    }
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        int V = 9; // Number of vertices
        int source = 0; // Source vertex

        // Example graph represented as an array of edges (source, destination, weight)
        Edge[] edges = {
                new Edge(0, 1, 4), new Edge(0, 7, 8), new Edge(1, 2, 8),
                new Edge(1, 7, 11), new Edge(2, 3, 7), new Edge(2, 8, 2),
                new Edge(2, 5, 4), new Edge(3, 4, 9), new Edge(3, 5, 14),
                new Edge(4, 5, 10), new Edge(5, 6, 2), new Edge(6, 7, 1),
                new Edge(6, 8, 6), new Edge(7, 8, 7)
        };

        int[] distance = Dijkstra(edges, V, source);
        System.out.println("Shortest distances from source vertex " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Vertex " + i + ": " + distance[i]);
        }
    }
}
