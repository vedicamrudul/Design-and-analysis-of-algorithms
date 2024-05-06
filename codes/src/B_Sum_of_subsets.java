import java.util.*;

public class B_Sum_of_subsets {

    public static void sos(int sum, int k, int remaining, int[] x, int[] weights, int MTotal, int n){
        x[k]=1;
       if (sum + weights[k] == MTotal){
//           System.out.println(sum+weights[k]);
           for(int i=1; i<=k; i++){
               if(x[i]==1){
                   System.out.print(weights[i]+ "\t");
               }
           }
           System.out.println("");

       }else{
           if(sum+weights[k+1]<=MTotal && k+1<n){
               sos(sum+weights[k], k+1, remaining-weights[k],x, weights,MTotal, n);
           }
           if(sum + remaining - weights[k] >=MTotal && sum + weights[k+1] <=MTotal && k+1<n){
               x[k]=0;
               sos(sum, k+1, remaining-weights[k],x, weights,MTotal, n);
           }
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Total: ");
        int MTotal=sc.nextInt();

        System.out.println("Enter number of weights: ");
        int n=sc.nextInt();

        int weights[]= new int[n+1];
        weights[0]=0;

        int remaining=0;

        System.out.println("Enter weights: ");
        for(int i=1; i<=n; i++){

            weights[i]=sc.nextInt();
            System.out.print("\t");
            remaining=remaining+ weights[i];
        }

        int[] x= new int[n+1];
        x[0]=0;

        sos(0, 1,remaining, x,weights,MTotal, n);
    }
}
