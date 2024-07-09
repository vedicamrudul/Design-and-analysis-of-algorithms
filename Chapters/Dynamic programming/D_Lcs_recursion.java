public class D_Lcs_recursion {

    public static int lcs(int i, int j,String a, String b, int a_len, int b_len){
        if(i==a_len || j==b_len){
            return 0;
        }
        else if(a.charAt(i)==b.charAt(j)){
            return 1+ lcs(i+1, j+1, a, b, a_len, b_len);
        }
        else{
            int left=lcs(i+1, j, a, b, a_len, b_len);
            int right=lcs(i, j+1, a, b, a_len, b_len);
            if(left>right){
                return left;
            }
            else{
                return right;
            }
        }
    }
    public static void main(String[] args) {
        String a="savannah";
        String b="havana";

        System.out.println(lcs(0,0,a,b,a.length(), b.length()));

    } 
}
