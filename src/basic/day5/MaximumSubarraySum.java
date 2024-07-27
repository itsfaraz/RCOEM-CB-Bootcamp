package basic.day5;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        int n = arr.length;
        int max = 0;
        for(int start = 0; start < n; start++){
            int sum = 0;
            for(int end = start; end < n; end++){
               sum += arr[end];
            }
            if (sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
