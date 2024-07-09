public class H_knapsack{
    static int[][] table;

    public static void knapsack(int[] w, int[] p, int capacity){
        int n = w.length;
        table = new int[n+1][capacity+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=capacity; j++){
                if(i==0 || j==0){
                    table[i][j]=0;
                }
                else if(w[i-1]<=j){
                    table[i][j]=Math.max(p[i-1]+table[i-1][j-w[i-1]],table[i-1][j]);
                }
                else{
                    table[i][j]=table[i-1][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] w={2,3,4,5};
        int[] p={1,2,5,6};
        int capacity=8;

        knapsack(w,p,capacity);

        System.out.println("Maximum value that can be stored in the knapsack: " + table[w.length][capacity]);

        for(int i=0; i<=w.length; i++){
            for(int j=0; j<=capacity; j++){
                System.out.print(table[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}