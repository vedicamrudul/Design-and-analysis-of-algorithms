import java.util.*;
// REMINDER: respond to Nish and That other guy.
// sample input: n=6 and 
// 6 7 4 2 9 3 

public class A_min_max {

    public static int[] min_max(int[] arr, int low, int high){
        int result[] =new int[2];
    // index of max is 0 and min is 1

        if(high==low){
            result[0]=arr[high];
            result[1]=arr[high];
            return result;
        }
        else if(high==low+1){
            if(arr[high]> arr[low]){
                result[0]=arr[high];
                result[1]=arr[low];
            }
            else{
                result[1]=arr[high];
                result[0]=arr[low];
            }
            return result;
        }
        else{
            int mid=(low+high)/2;
            int[] subResult1=new int[2];
            int[] subResult2=new int[2];

            subResult1=min_max(arr, low, mid);
            subResult2=min_max(arr, mid+1, high);

            if(subResult1[0]> subResult2[0]){
                result[0]=subResult1[0];
            }
            else{
                result[0]=subResult2[0];
            }
            if(subResult1[1]<subResult2[1]){
                result[1]=subResult1[1];
            }
            else{
                result[1]=subResult2[1];
            }

            return result;
        }

        // return result;
    }
    
    public static void main(String[] args) {
        System.out.println("\n");

        System.out.println("Enter Number of elements in your array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       
        int[] result=new int[2];

        result=min_max(arr, 0, n-1);
        System.out.println("The min is: " + result[1] + " and the max is: " +result[0]);

        System.out.println("\n");
    }
    
}
