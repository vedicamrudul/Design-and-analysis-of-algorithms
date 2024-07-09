// this is like recursion only but we are also storing the values in a memo table.
// so in case that recursive call is made again, we can just return the value from the memo table.

public class E_lcs_memo {

    static int[][] memo;
    static String a="savannah";
    static String b="havana";
    static int alen=a.length();
    static int blen=b.length();
  

    public static int lcs(int i, int j){
        if(i==alen || j==blen){
            return 0;
        }
        if(memo[i][j]!=0){
            return memo[i][j];
        }
        else if(a.charAt(i)==b.charAt(j)){
            memo[i][j]=1+ lcs(i+1, j+1);
            return memo[i][j];
        }
        else{
            int left=lcs(i+1, j);
            int right=lcs(i, j+1);
            if(left>right){
                memo[i][j]=left;
            }
            else{
                memo[i][j]=right;
            }
        }
        return memo[i][j];
    }
    public static void main(String[] args) {
        
        memo=new int[alen+1][blen+1];
       for(int i=0; i<alen+1; i++){
            for(int j=0; j<blen+1; j++){
                memo[i][j]=0;
            }
        }
        System.out.println(lcs(0, 0));

        for (int i = 0; i < alen+1; i++) {
            for (int j = 0; j < blen+1; j++) {
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
            
        }
    }


}



// memo=new int[alen+1][blen+1];
// for(int i=0; i<alen+1; i++){
//     memo[i][0]=0;
// }
// for(int i=0; i<blen+1; i++){
//     memo[0][i]=0;
// }