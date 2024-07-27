package basic.day7;

import java.util.Arrays;

public class Merge2SortedArray {

    public static void main(String[] args) {
        int []arr1 = {1     ,3     ,4    ,5};
        int []arr2 = {1     ,2      ,6    ,7    ,      8};

        int []result = merge(arr1,arr2);
        System.out.println(Arrays.toString(result));

    }


    public static int[] merge(int []arr1,int []arr2){

        int pointer1 = 0;
        int pointer2 = 0;

        int []result = new int[arr1.length + arr2.length];
        int resultIdx = 0;
        while (pointer1 < arr1.length && pointer2 < arr2.length){

            if (arr1[pointer1] <= arr2[pointer2]){
                result[resultIdx] = arr1[pointer1];
                pointer1++;
            }else{
                result[resultIdx] = arr2[pointer2];
                pointer2++;
            }
            resultIdx++;
        }

        while (pointer1 < arr1.length){
            result[resultIdx] = arr1[pointer1];
            pointer1++;
            resultIdx++;
        }

        while (pointer2 < arr2.length){
            result[resultIdx] = arr2[pointer2];
            pointer2++;
            resultIdx++;
        }

        return result;
    }

}
