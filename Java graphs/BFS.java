import java.util.*;

public class BFS {
    public static void main(String[] args) {
        // Create a graph as an adjacency list
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1, 5));
        graph.put(5, Arrays.asList(2, 4));
        
        // Perform BFS starting from node 0
        bfs(graph, 0);
    }
    
    public static void bfs(HashMap<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(start);
        visited.add(start);
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            
            for (int neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
