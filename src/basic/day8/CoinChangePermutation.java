package basic.day8;

public class CoinChangePermutation {

//    2  3
    public static void coinChange(int []coins,int target,String ans){

        if (target == 0){
            System.out.println(ans);
            return;
        }

        if (target < 0){
            return;
        }

        for (int idx = 0; idx < coins.length; idx++){
            coinChange(coins,target - coins[idx], ans + coins[idx]+" ");
        }

    }

}
