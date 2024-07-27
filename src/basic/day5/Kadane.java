package basic.day5;

public class Kadane {

    public static void main(String[] args) {

        int []arr= {2, 3, -6, 1, 2, 3, -4, 5, -10, 6};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int idx = 1; idx < arr.length; idx++){
            sum = Math.max(sum+arr[idx],arr[idx]);
            max = Math.max(sum,max);
        }
        System.out.println(max);


    }

}
