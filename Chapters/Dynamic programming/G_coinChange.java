public class G_coinChange {
    static int[][] cpp;

    public static void coinChange(int d, int[] CD, int amount){
        cpp = new int[d+1][amount+1];
        for(int i=0; i<=d; i++){
            for(int j=0; j<=amount; j++){
                if(j==0){
                    cpp[i][j]=0;
                }
                else if(i==0){
                    cpp[i][j]=amount+1;
                }
                else{
                    if(CD[i-1]<=j){
                        cpp[i][j]=Math.min(cpp[i-1][j], 1+cpp[i][j-CD[i-1]]);
                    }
                    else{
                        cpp[i][j]=cpp[i-1][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
       int amount=11;
       int[] CD={1,5,6,9};
       int d = CD.length;

       coinChange(d, CD, amount);

       if(cpp[d][amount] > amount) {
           System.out.println("No solution");
       } else {
           System.out.println("Minimum coins required: " + cpp[d][amount]);
       }
       for(int i=0; i<=d; i++){
           for(int j=0; j<=amount; j++){
               System.out.print(cpp[i][j] + "\t");
           }
           System.out.println("");
       }
    }

}