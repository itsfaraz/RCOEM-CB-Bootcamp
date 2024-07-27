package advance.day6;

public class CoinChange {

    public static void main(String[] args) {
        int []coins = {2,3,5};
        int target = 8;
        coinChangePermutation(coins,target,"");
    }

    public static void coinChangePermutation(int []coins,int target,String ans){

        if (target < 0){
            return;
        }

        if (target == 0){
            System.out.println(ans);
            return;
        }
        for (int idx =0; idx < coins.length; idx++){
            coinChangePermutation(coins,target - coins[idx],ans+coins[idx]+" ");
        }
    }

}
