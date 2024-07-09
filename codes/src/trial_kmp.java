// three conditions: first they are same: then i++ j++
// second j>0 then j=LPS[j-1] and third is just else with i++

public class trial_kmp {

    static int[] lps;

    public static void longest_pref(String p) {
        lps = new int[p.length()];
        lps[0] = 0;
        int i = 1;
        int j = 0;
        while (i < p.length()) {
            if (p.charAt(j) == p.charAt(i)) {
                lps[i] = j + 1;
                j++;
                i++;
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

    }

    public static void kmp(String t, String p){
        int m=t.length();
        int n=p.length();
        int i=0;
        int j=0;
        while(i<m){
            if(p.charAt(j)==t.charAt(i)){
                System.out.println("j and i : " + j +" " + i);
                System.out.println("p.charAt(j) and t.charAt(i) : " + p.charAt(j) + " " + t.charAt(i)) ;
                j++;
                i++;
                if(j==n){
                    System.out.println("Pattern found at index: " + (i-n+1));
                    break;
                }
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
        String t = "ababababababcdabab";
        String p = "ababcd";

        longest_pref(p);
        kmp(t,p);
    }
}
