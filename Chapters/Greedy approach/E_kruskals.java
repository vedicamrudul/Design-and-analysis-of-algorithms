import java.util.*;
// lets go kruskal=> minimum cost spanning tree. We create a data structure for edge and then sort it out. we inherit the comparable class and override compareTo to sort the edges based on weight? we also need find and union so a parent array and a makeset/makeParent method. Also keep track of edgeCount


public class E_kruskals {
    static class Edge implements Comparable<Edge> {
        int source, destination, weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        // Compare edges based on their weight for sorting
        @Override
        public int compareTo(Edge edge) {
            return this.weight - edge.weight;
        }
    }

    // Array to store the parent of each vertex for union-find
    static int[] parent;

    // Function to initialize the union-find structure
    static void makeSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = -1;
        }
    }

    // Function to find the root of the set containing x using path compression
    static int find(int i) {
        int j=i;
        while(parent[j]>0){
            j=parent[j];
        }
        return j;
    }

    // Function to union two sets containing x and y
    static void union(int i, int j) {

        int root1=find(i);
        int root2=find(j);
        int x=parent[root1] + parent[root2];
        if(root1!=root2){
            if(parent[root1]>parent[root2]){
                parent[root1]=root2;
                parent[root2]=x;
            }
            else{
                parent[root1]=root2;
                parent[root1]=x;
            }
        }
    }

    static void kruskal(Edge[] edges, int n) {
        Arrays.sort(edges);
        List<Edge> mst = new ArrayList<>();
        int minCost = 0;

        makeSet(n);
        int edgeCount = 0;
        // edgeCount is to know kitne edges hai (agar n-1 se kam hai mathlab min spanning tree not possible cuz cycles honge and agar n-1 hai toh break the loop cuz ban gaya tree)

        // Iterate over sorted edges
        for (Edge edge : edges) {
            // If we have found n-1 edges for the MST, break
            if (edgeCount == n - 1) break;

            int rootSource = find(edge.source);
            int rootDestination = find(edge.destination);

            // If including this edge does not form a cycle
            if (rootSource != rootDestination) {
                mst.add(edge);
                minCost =minCost+  edge.weight;
                union(rootSource, rootDestination);
                edgeCount++;
            }
        }

        // If we have less than n-1 edges, the graph is not connected
        if (edgeCount != n - 1) {
            System.out.println("No spanning tree");
        } else {
            System.out.println("Minimum cost of spanning tree: " + minCost);
            System.out.println("Edges of the minimum spanning tree:");
            for (Edge edge : mst) {
                System.out.println("(" + edge.source + ", " + edge.destination + ")" + " " + edge.weight);
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; 
        Edge[] edges = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        kruskal(edges, n);
    }
}


