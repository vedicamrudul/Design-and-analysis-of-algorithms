public class trial_naive {

    public static void naive(String t, String p) {
        int m = t.length();
        int n = p.length();
        for (int i = 0; i < m - n; i++) {
           
            int j = 0;
            
            while (j < n) {
                if (p.charAt(j) == t.charAt(i + j)) {
                    if (j == n - 1) {
                        System.out.println("Pattern found at index: " + i);
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        String t = "ababababcabcapabcdabab";
        String p = "abcd";
        naive(t, p);

    }
}
