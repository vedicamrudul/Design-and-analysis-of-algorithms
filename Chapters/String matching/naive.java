// naive string matching algorithm

public class naive {

    public static void naiveS(String T, String P){
        int n=T.length();
        int m=P.length();

        for(int i=0; i<=n-m; i++){
            int j=0;
            while(j<m && T.charAt(i+j)==P.charAt(j)){
                j++;
            }
            if(j==m){
                System.out.println("Pattern found at index: " + i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        String T="abababcabcabcdaaa";
        String P="abcd";

        naiveS(T,P);
    }
}
