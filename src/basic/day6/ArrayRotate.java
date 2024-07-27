package basic.day6;

import java.util.Arrays;

public class ArrayRotate {

    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        rotateOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotateA1(int []arr,int k){
        for (int idx =0; idx < k; idx++){
            rotateOne(arr);
        }
    }
    public static void rotateOne(int []arr){
        int temp = arr[arr.length-1];
        for (int idx = arr.length-1; idx >= 1; idx--){
            arr[idx] = arr[idx-1];
        }
        arr[0] = temp;
    }














    public static void swap(int []arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void reverse(int []arr,int start,int end){
        while (start <= end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void rotate(int []arr,int k){
        reverse(arr,0,(arr.length-k)-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }


}
