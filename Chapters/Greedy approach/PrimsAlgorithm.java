import java.util.*;

public class PrimsAlgorithm {

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void primMST(int[][] cost) {
        int V = cost.length;
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        int[] key = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);

        // Start from the first vertex
        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {
            int u = minKey(key, visited);
            visited[u] = true;

            for (int v = 0; v < V; v++) {
                if (cost[u][v] != 0 && !visited[v] && cost[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = cost[u][v];
                }
            }
        }

        printMST(parent, cost);
    }

    public static int minKey(int[] key, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < key.length; v++) {
            if (!visited[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void printMST(int[] parent, int[][] cost) {
        System.out.println("Edge   Weight");
        for (int v = 1; v < cost.length; v++) {
            System.out.println(parent[v] + " - " + v + "   " + cost[v][parent[v]]);
        }
    }

    public static void main(String[] args) {
        int[][] cost = { { 0, 2, 0, 6, 0 },
                          { 2, 0, 3, 8, 5 },
                          { 0, 3, 0, 0, 7 },
                          { 6, 8, 0, 0, 9 },
                          { 0, 5, 7, 9, 0 } };
        primMST(cost);
    }
}

