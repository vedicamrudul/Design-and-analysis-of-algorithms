
import java.util.*;

    public class Rabin {

        public static void rabin_karp(String p, String t, int q) {
            int n = t.length();
            int m = p.length();
            int hashp = 0;
            int hasht = 0;
            for (int i = 0; i < m; i++) {
                hashp = (hashp + ((int) ((p.charAt(i)) * Math.pow(10, m - i-1)))) % q;
                hasht = (hasht + ((int) ((t.charAt(i)) * Math.pow(10, m - i-1)))) % q;
            }
    
            for (int i = 0; i <= n - m; i++) {
                if (hashp == hasht) {
                    int j = 0;
                    while (j < m) {
                        if (t.charAt(i + j) != p.charAt(j)) {
                            break;
                        }
                        j++;
                    }
                    if (j == m) {
                        System.out.println("Pattern found at index: " + i);
                    }
                }
                if (i < n - m) {
                    hasht = (hasht - (int) ((t.charAt(i)) * Math.pow(10, m - 1))) % q;
                    hasht = (hasht * 10 + (int) (t.charAt(i + m))) % q;
                    
                    if (hasht < 0) {
                        hasht = (hasht + q);
                    }
                }
            }
        }
    

    public static void main(String[] args) {
        String t = "aaaamalayalalam";
        String p = "yala";
        int q = 11;

        rabin_karp(p, t, q);
    }

}
