public class MatrixChainMultiplication {
    // Function to find the minimum number of multiplications needed for matrix chain multiplication
    static int[][] m;
    static int matrixChainOrder(int[] dimension, int n) {
        // Create a 2D array to store minimum number of multiplications
        m = new int[n][n];

        // Initialize diagonal elements to 0 (no multiplication needed for single matrix)
        for (int i = 1; i < n; i++)
            m[i][i] = 0;


        // Build the table to store minimum number of multiplications needed for different chain lengths
        for (int L = 2; L < n; L++) {
            for (int i = 1; i < n - L + 1; i++) {
                int j = i + L - 1;
                m[i][j] = Integer.MAX_VALUE;
                // Try all possible split points and find the one that minimizes the number of multiplications
                for (int k = i; k < j ; k++) {
                    int q = m[i][k] + m[k + 1][j] + dimension[i - 1] * dimension[k] * dimension[j];
                    if (q < m[i][j]) {
                        m[i][j] = q;

                    }
                }
            }
        }
        // Return the minimum number of multiplications needed for the entire chain
        return m[1][n - 1];
    }


    public static void main(String[] args) {
        int[] dimension = {1, 5, 4, 3, 2, 1}; // Dimensions of matrices
        int n = dimension.length; // Number of matrices

        // Find the minimum number of multiplications and print the optimal parenthesization
        System.out.println("Minimum number of multiplications is " + matrixChainOrder(dimension, n));
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(m[i][j] + "\t");
            System.out.println();
        }
    }


}

