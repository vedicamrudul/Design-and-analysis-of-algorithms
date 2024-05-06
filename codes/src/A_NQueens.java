import java.util.*;
import java.lang.Math.*;
public class A_NQueens {

    public static boolean place(int k, int i, int[] x){
            for(int j=1; j<=k-1; j++){
                if (x[j] == i || Math.abs(x[j]-i)==Math.abs(j-k)) {
                    return false;
                }
        }
        return true;
    }

    public static void NQueens(int k, int n, int[] x){
        for (int i=1; i<=n; i++){
            if(place(k,i,x)){
                x[k]=i;
                if(k==n){
                    for(i=1; i<=n; i++){
                        System.out.print(x[i]);
                    }
                    System.out.println("");
                }
                else{
                    NQueens(k+1, n, x);
                }
            }
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of queens: ");
        int n=sc.nextInt();
        int[] x=new int[n+1];
        x[0]=0;
        NQueens(1, n, x);

    }
}
