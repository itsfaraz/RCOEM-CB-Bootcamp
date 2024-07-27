package basic.day4;

import java.util.Arrays;

public class PrintPattern {

    public static void main(String[] args) {
        int []input = {3,2,1,5,6};
        System.out.println(Arrays.toString(input));
        System.out.println();
        print(input);
    }

    public static void print(int []arr){
        int max = getMax(arr);
        for (int row =0; row < max; row++){
            for (int col = 0; col < arr.length; col++){
                if (max - arr[col] > row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    public static int getMax(int []arr){
        int max = 0;
        for (int idx = 0; idx < arr.length; idx++){
            if (arr[idx] > max){
                max = arr[idx];
            }
        }
        return max;
    }
}
