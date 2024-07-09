import java.util.Scanner;

public class A_Fib {
    
    public static int fib(int n, int[] lookuptable){
        int result;
        if(lookuptable[n]!=-1){
            return lookuptable[n];
            // if the value at table is filled up then return the value
        }
        if(n<=1){
            result=n;
            // if n=0 or n=1 then fib(n)=n
        }
        else{
            result=fib(n-1, lookuptable) +fib(n-2,lookuptable);
            // formula to fill up table if value is not filled
        }
        lookuptable[n]=result;
        // update the table for future
        return result;
        
    }
        public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] lookuptable=new int[num+1];
        for(int i=0; i<num+1; i++){
            lookuptable[i]=-1;
        }
        System.out.println("The Fibonacci number at position " + num + " is " + fib(num, lookuptable));
    }
}
