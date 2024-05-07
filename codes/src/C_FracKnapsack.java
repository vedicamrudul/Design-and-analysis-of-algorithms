import java.util.*;
public class C_FracKnapsack {

    public static void knapsack(float[] weights, float[] profits, float capacity, float[] x){
        float currCap=capacity;
        float currProf=0;
        int j=0;
        for(j=0; j<weights.length; j++){
           if(weights[j]>currCap){
              break;
            }
           x[j]=1;
           currCap=currCap-weights[j];
           currProf=currProf+ profits[j];


        }
        System.out.println(currProf);
        if(j<=weights.length){
            x[j]=currCap/ weights[j];
            currProf=currProf+ profits[j]*x[j];
        }
        for(int i=0; i<weights.length; i++){
                System.out.print(x[i] + "\t\t");

        }
        System.out.println("");
        for(int i=0; i<weights.length; i++){

                System.out.print(weights[i] + "\t\t");
         
        }
        System.out.println("\nTotal profit: " + currProf);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of weights: ");
        int n=sc.nextInt();
        System.out.println("Enter the weights: ");
        float[] weights=new float[n];
        float[] profits=new float[n];
        for(int i=0; i<n; i++){
            weights[i]= sc.nextFloat();
        }
        System.out.println("Enter profits: ");
        for(int i=0; i<n; i++){
            profits[i]= sc.nextFloat();
        }
        System.out.println("Enter the total capacity of knapsack: ");
        float capacity=sc.nextFloat();

        float[] x=new float[n];
        for(int i=0; i<n; i++){
            x[i]=0;
        }

        knapsack(weights, profits, capacity, x);
    }
}
