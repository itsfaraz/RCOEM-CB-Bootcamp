package basic.day5;

public class SubarrayPrint {

    public static void main(String[] args) {

        int []arr = {10,20,30,40};
        int n = arr.length;
        int max = 0;
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                int sum = 0;
                for(int print = start; print <= end; print++){
                    sum = sum + arr[print];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }

}
