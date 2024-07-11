import java.util.*;

public class bfs_matrix {
    public static void main(String[] args) {
        // Example graph as an adjacency matrix
        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1},
            {0, 0, 1, 0, 1, 0}
        };
        
        // Perform BFS starting from node 0
        bfs(graph, 0);
    }
    
    public static void bfs(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(start);
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            
            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}

