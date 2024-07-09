public class F_lcs_bottomup {
    static String a = "havana";
    static String b = "savannah";
    static int alen = a.length();
    static int blen = b.length();
    static int[][] lcs = new int[alen+1][blen+1];

    public static void lcsFun() {
    for(int x=1; x<=alen; x++){
        for(int y=1; y<=blen; y++){
            if(a.charAt(x-1)==b.charAt(y-1)){
                lcs[x][y]=1+lcs[x-1][y-1];
            }
            else{
                lcs[x][y]=Math.max(lcs[x-1][y], lcs[x][y-1]);
            }
        }
    }
    }

    public static void main(String[] args) {
        System.out.println(lcs[0][0]);
        lcsFun();
        System.out.println("Length of LCS is: " + lcs[alen][blen]);
        for (int i = 0; i <= alen; i++) {
            for (int j = 0; j <= blen; j++) {
                System.out.print(lcs[i][j] + " ");
            }
            System.out.println();
        }
    }
}