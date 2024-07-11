import java.util.*;

public class dfs_matrix {
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
        
        // Perform DFS starting from node 0
        dfs(graph, 0);
    }
    
    public static void dfs(int[][] graph, int start) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(start);
        visited[start] = true;
        
        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + " ");
            
            for (int i = 0; i < n; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }
}

