package advance.day6;

public class CoinChangeCombination {

    public static void main(String[] args) {
        int []coins = {2,3,5};
        int target = 8;
        coinCombination(coins,0,target,"");
    }
    public static void coinCombination(int []coin,int vidx,int target,String ans){
        if (target < 0){
            return;
        }
        if (target == 0){
            System.out.println(ans);
            return;
        }
        for (int idx =vidx; idx < coin.length; idx++){
            coinCombination(coin,idx,target - coin[idx],ans+coin[idx]+" ");
        }
    }

}
