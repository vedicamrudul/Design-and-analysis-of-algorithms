public class hami {
    public static void hamiltonian(int k, int n, int[] x, int[][] graph){
        while(true){
            nextValue(k, n, x, graph);
            if(x[k]==0){
                return;
            }
            if(k==n-1){
                for(int i=0; i<n; i++){
                    System.out.print(x[i] + " ");
                }
                System.out.println(x[0]);
            }
            else{
                hamiltonian(k+1, n, x, graph);
            }
        }
    }

    public static void nextValue(int k, int n, int[] x, int[][] graph){
        while(true){
            x[k] = (x[k]+1)%(n);
            if(x[k]==0){
                return;
            }
            if(graph[x[k-1]][x[k]]==1){
                int j;
                for(j=1; j<k; j++){
                    if(x[j]==x[k]){
                        break;
                    }
                }
                if(j==k){
                    if(k+1<n || (k==n-1 && graph[x[k]][x[0]]==1)){
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };
        
        int n=graph.length;
        System.out.println(n);

        int[] x = new int[n];
        for(int i=0; i<n; i++){
            x[i]=0;
        }
        x[0]=0;
        hamiltonian(1, n, x, graph);
    }
}
