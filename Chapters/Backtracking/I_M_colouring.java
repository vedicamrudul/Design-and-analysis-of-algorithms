import java.util.*;

public class I_M_colouring {

    public static boolean mcolouring(int k, int n, int m, int[][] a, int[] x){
        while(true){
           NextValue(k, m, a, x);
           if(x[k]==0){
            return false;
           }
           if(k==(n-1)){
            return true;
           }
           else{
            if(mcolouring(k+1, n, m, a, x)){
                return true;
            }
           }
        }
    }

    public static void NextValue(int k, int m, int[][] a, int[] x){
        while(true){
           x[k]=(x[k]+1)%(m+1);
           if(x[k]==0){
               return;
           }
           int j=0;
           while(j<k){
               if(a[k][j]==1 && x[k]==x[j]){
                   break;
               }
               j++;
           }
           if(j==k){
               return;
           }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\n");
        int[][] graph = {{0, 1, 1, 1},
                         {1, 0, 1, 0},
                         {1, 1, 0, 1},
                         {1, 0, 1, 0}};
        int m = 3; // Number of colors
        int[] colors = new int[4]; // Number of vertices

        if (mcolouring(0, 4, m, graph, colors)) {
            System.out.println("Solution exists and one of the possible colorings is:");
            for (int i = 0; i < 4; i++) {
                System.out.print(colors[i] + "\t");
            }
        } else {
            System.out.println("Solution does not exist.");
        }
        System.out.println("\n\n");
    }
}