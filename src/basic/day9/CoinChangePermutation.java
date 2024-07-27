package basic.day9;

public class CoinChangePermutation {

    public static void main(String[] args) {
        int []coins = {2,3,5};
        int target = 8;
        coinChangeCombination(coins,0,target,"");
//        coinChange(coins,target,"");

    }
    public static void coinChange(int []coin, int target, String ans){
        if (target == 0){
            System.out.println(ans);
            return;
        }
        if (target < 0){
            return;
        }
        for (int idx = 0; idx < coin.length; idx++){
            coinChange(coin,target - coin[idx],ans + coin[idx]+" ");
        }
    }

    public static void coinChangeCombination(int []coin,int vidx, int target, String ans){
        if (target == 0){
            System.out.println(ans);
            return;
        }
        if (target < 0){
            return;
        }
        for (int idx = vidx; idx < coin.length; idx++){
            coinChangeCombination(coin, idx,target - coin[idx],ans + coin[idx]+" ");
        }
    }

}
