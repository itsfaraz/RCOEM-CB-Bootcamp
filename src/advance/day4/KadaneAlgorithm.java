package advance.day4;

public class KadaneAlgorithm {


    public static void main(String[] args) {
//        int []input = {-2,1,-3,4,-1,2,1,-5,4};
        int []input = {5,4,-1,7,8};
        System.out.println(kadane(input));
    }

    public static int kadane(int []nums){

        int sum = nums[0];
        int max = Integer.MIN_VALUE;

        for(int idx = 1; idx < nums.length; idx++){
            sum = Math.max(sum+nums[idx],nums[idx]); // join existing club or create a new club
            max = Math.max(max,sum);               // check max value
        }
        return max;
    }

}
