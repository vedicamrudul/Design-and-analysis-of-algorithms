package codes;

// lets go kruskal=> minimum cost spanning tree. We create a data structure for edge and then sort it out. we inherit the comparitor class? we also need find and union so a parent array and a makeset method
import java.util.*;

public class trial_Kruskals {
    static class Edge implements Comparable<Edge> {

        int source, destination, weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge edge) {
            return this.weight - edge.weight;
        }
    }

    static int[] parent;

    static void makeParent(int n) {
        // n is the number of edges
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }

    static int find(int i) {
        int j = i;

        while (parent[j] > 0) {
            j = parent[j];
        }

        return j;
    }

    static void union(int i, int j) {
        int root1 = find(i);
        int root2 = find(j);

        int x = parent[root1] + parent[root2];
        if (root1 != root2) {
            if (root1 > root2) {
                parent[root1] = root2;
                parent[root2] = x;
            } else {
                parent[root2] = root1;
                parent[root1] = x;
            }
        }
    }



    public static void kruskals(Edge[] edges, int V) {
        int totalEdges = 0;
        int minCost = 0;
        List<Edge> spanningTree = new ArrayList<>();
        Arrays.sort(edges);
        for (Edge edge : edges) {

            if (totalEdges == V - 1) {
                break;
            }

            int root1 = find(edge.source);
            System.out.println(edge.destination);
            int root2 = find(edge.destination);

            if (root1 != root2) {
                spanningTree.add(edge);
                minCost = minCost + edge.weight;
                totalEdges++;
                union(edge.source, edge.destination);
            }
        }

        if (totalEdges < V - 1) {
            System.out.println("\nThe minimum cost spanning tree does not exist for this!\n");
        }
        System.out.println("\nThe minimum cost is: " + minCost);

        for (Edge edge : spanningTree) {
            System.out.println(edge.source + " - " + edge.destination + " || weight : " + edge.weight);
        }
    }

    public static void main(String[] args) {
        int V = 4;

        makeParent(V);
        Edge[] edges = {
                new Edge(0, 1, 10),
                new Edge(0, 2, 6),
                new Edge(0, 3, 5),
                new Edge(1, 3, 15),
                new Edge(2, 3, 4)
        };

        kruskals(edges, V);
    }
}
