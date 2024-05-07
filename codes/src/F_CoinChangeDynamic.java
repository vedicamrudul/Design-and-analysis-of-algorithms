import java.util.*;
public class F_CoinChangeDynamic {

    public static void CoinChange(int amount, int[] denom){

        //sorting denominations from max to min (i am putting sorted denom in this code, you can sort in exam.

        while(amount!=0){
            int count=0;
            for(int i=0; i<denom.length; i++){
                if(denom[i]<=amount) {
                    System.out.print(denom[i] + "\t");
                    amount=amount-denom[i];
                    count=0;
                    break;
                }
                else{
                    count++;
                }
                if(count==denom.length){
                    break;
                }
            }
            if(count==denom.length){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] denom={50,20,10,1};
        int amount=273;
        CoinChange(amount,denom);
    }
}
