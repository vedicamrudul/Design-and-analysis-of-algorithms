import java.util.*;

public class DFS {
    public static void main(String[] args) {
        // Create a graph as an adjacency list
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(2, 4));
        
        // Perform DFS starting from node 0
        dfs(graph, 0);
    }
    
    public static void dfs(HashMap<Integer, List<Integer>> graph, int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        
        stack.push(start);
        visited.add(start);
        
        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + " ");
            
            for (int neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
