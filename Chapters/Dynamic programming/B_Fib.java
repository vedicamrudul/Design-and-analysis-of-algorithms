// this is bottom up approach (tabulation)
import java.util.*;

public class B_Fib {
    public static int fib(int n, int[] table){
        table[0]=0;
        table[1]=1;
        // fill the table values from the bottom

        for(int i=2; i<n; i++){
            table[i]=table[i-2]+table[i-1];
            // calculate next value on each iteration
        }
        return table[n-1];
        // return the last value
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] table=new int[num+1];
        System.out.println("The Fibonacci number at position " + num + " is " + fib(num+1, table));
    }
}
