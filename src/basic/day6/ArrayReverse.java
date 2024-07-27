package basic.day6;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        reverseA1(arr);
    }
    public static void reverseA1(int []arr){

        int []temp = new int[arr.length];
        int tIdx = 0;
        for (int idx = arr.length-1; idx >= 0; idx--){
            temp[tIdx] = arr[idx];
            tIdx++;
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void reverse(int []arr){

        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            swapElements(start,end,arr);
            start++;
            end--;
        }
    }
    private static void swapElements(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
