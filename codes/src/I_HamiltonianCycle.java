
import java.util.Arrays;

public class I_HamiltonianCycle {

    public static boolean hamiltonianCycle(int k, int n, int[][] graph, int[] x) {
        while (true) {
            NextValue(k, n, graph, x);
            if (x[k] == 0) {
                return false;
            }
            if (k == n - 1) {
                if (graph[x[k]][x[0]] == 1) {
                    return true;
                }
            } else {
                if (hamiltonianCycle(k + 1, n, graph, x)) {
                    return true;
                }
            }
        }
    }

    public static void NextValue(int k, int n, int[][] graph, int[] x) {
        while (true) {
            x[k] = (x[k] + 1) % n;
            if (x[k] == 0) {
                return;
            }
            if (graph[x[k - 1]][x[k]] == 1) {
                int j;
                for (j = 0; j < k; j++) {
                    if (x[j] == x[k]) {
                        break;
                    }
                }
                if (j == k) {
                    if (k < n - 1 || (k == n - 1 && graph[x[k]][x[0]] == 1)) {
                        return;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\n");
        int[][] graph = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };
        int n=5;
        int[] x = new int[n];
        Arrays.fill(x, 0);
        x[0] = 0; // Starting point of the Hamiltonian cycle

        if (hamiltonianCycle(1, n, graph, x)) {
            System.out.println("Solution exists and one of the possible Hamiltonian cycles is:");
            for (int i = 0; i < n; i++) {
                System.out.print(x[i] + "\t");
            }
            System.out.print(x[0] + "\t"); // To show the cycle
        } else {
            System.out.println("Solution does not exist.");
        }
        System.out.println("\n\n");
    }
}
