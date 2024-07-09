
class Dijkstras {
 
    // this algo is to find the shortest path of all vertex from a single source vertex. 
    // we have a visited array and a distance array. We start from source and update the visited array and the distance array after each iteration.

    static final int V = 9;
    public static int minDistance(int dist[], int visited[])
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int i = 0; i < V; i++)
            if (visited[i] == 0 && dist[i] <min) {
                min = dist[i];
                min_index = i;
            }

        return min_index;
    }

    public static void dijkstra(int cost[][], int source)
    {
        int dist[] = new int[V]; 
        int visited[] = new int[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = 0;
        }

        dist[source] = 0;

        for (int i = 0; i < V - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = 1;

            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in visited,
                // there is an edge from u to v, and total
                // weight of path from source to v through u is
                // smaller than current value of dist[v]
                if (visited[v]==0 && cost[u][v] != 0
                    && dist[u] + cost[u][v] < dist[v])
                    dist[v] = dist[u] + cost[u][v];
        }
        System.out.println(
            "Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public static void main(String[] args)
    {
      
        int cost[][]
            = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                            { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                            { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                            { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                            { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                            { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                            { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                            { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

                            // 1 and 2 => 4, 1 and 7 => 8, 2 and 3 => 8, 2 and 8 => 11, 3 and 4 => 7, 3 and 6 => 4, 4 and 5 => 9, 5 and 6 => 10, 6 and 7 => 2, 7 and 8 => 1, 8 and 9 => 7

                            // Edge[] edges={
                            //     new Edge(1, 2, 4),
                            //     new Edge(1, 7, 8),
                            //     new Edge(2, 3, 8),
                            //     new Edge(2, 8, 11),
                            //     new Edge(3, 4, 7),
                            //     new Edge(3, 6, 4),
                            //     new Edge(4, 5, 9),
                            //     new Edge(5, 6, 10),
                            //     new Edge(6, 7, 2),
                            //     new Edge(7, 8, 1),
                            //     new Edge(8, 9, 7)
                            // }


        dijkstra(cost, 0);
    }
}



