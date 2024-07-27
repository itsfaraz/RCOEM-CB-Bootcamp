package advance.day4;

public class MaximumSubarraySum {


    public static void main(String[] args) {
        int input[] = {10,20,30,40};
        int result = maximumSubarraySum(input);
        System.out.println(result);
    }



    public static int maximumSubarraySum(int []arr){

        int max = Integer.MIN_VALUE;

        for (int idx = 0; idx < arr.length; idx++){
            int sum = 0;
            for (int innerIdx = idx; innerIdx < arr.length; innerIdx++){
                sum += arr[innerIdx];
            }
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }

}
