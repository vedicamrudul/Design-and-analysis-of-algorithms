public class kmp {

    static int[] lps;
    public static void longest_proper_prefix(String p){
        int m=p.length();
        lps=new int[m];
        lps[0]=0;
        int i=1;
        int j=0;
        while(i<m){
            if(p.charAt(i)==p.charAt(j)){
                lps[i]=j+1;
                j++;
                i++;
            }
            else if (j>0){
                j=lps[j-1];
            }
            else{
                lps[i]=0;
                i++;
            }
        }
    }
    public static void kmp_matcher(String t, String p){
        int n=t.length();
        int m=p.length();
        longest_proper_prefix(p);
        int i=0;
        int j=0;
        while(i<n){
          if(t.charAt(i)==p.charAt(j)){
              if(j==m-1){
                    System.out.println("Pattern found at index: " + (i-m+1));
                    break;
                }
                i++; j++;
          }
          else if(j>0){
              j=lps[j-1];
          }
          else{
              i++;
          }
        
            
    }
}
    public static void main(String[] args) {
        String T="ababababababbababcdababab";
        String P="abba";
        kmp_matcher(T,P);
    }
}
