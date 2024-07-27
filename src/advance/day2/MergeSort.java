package advance.day2;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int []arr = {80,10,50,30,60,20,70,25};
        int []result = merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] arr,int low,int high){
        if (low == high) {
            return new int[]{arr[low]};
        }

        int mid = (low + high)/2;
        int[] smallerResult1 = merge(arr,low,mid);
        int[] smallerResult2 = merge(arr,mid+1,high);

        return merge2Sorted(smallerResult1,smallerResult2);

    }

    private static int[] merge2Sorted(int []arr1,int []arr2){

        int s1 = 0;
        int s2 = 0;
        int resultIdx = 0;
        int []result = new int[arr1.length+ arr2.length];
        while (s1 < arr1.length && s2 < arr2.length){
            if (arr1[s1] <= arr2[s2]){
                result[resultIdx] = arr1[s1];
                s1++;
            }else{
                result[resultIdx] = arr2[s2];
                s2++;
            }
            resultIdx++;
        }

        while (s1 < arr1.length){
            result[resultIdx] = arr1[s1];
            s1++;
            resultIdx++;
        }

        while (s2 < arr2.length){
            result[resultIdx] = arr2[s2];
            s2++;
            resultIdx++;
        }

        return result;
    }

}
