package advance.day9;

public class Merge2Sorted {

    public static int[] merge2Sorted(int []arr1,int []arr2){

        int pointer1 = 0;
        int pointer2 = 0;
        int []result = new int[arr1.length + arr2.length];
        int k = 0;

        while (pointer1 < arr1.length && pointer2 < arr2.length){
            if (arr1[pointer1] <= arr2[pointer2]){
                result[k] = arr1[pointer1];
                pointer1++;
            }else{
                result[k] = arr2[pointer2];
                pointer2++;
            }
            k++;
        }

        while (pointer1 < arr1.length){
            result[k] = arr1[pointer1];
            pointer1++;
            k++;
        }

        while (pointer2 < arr2.length){
            result[k] = arr2[pointer2];
            pointer2++;
            k++;
        }

        return result;
    }


    public static int[] mergeSort(int []arr,int left,int right){
        if (left <= right) {
            return new int[]{arr[right]};
        }
        int mid = (left + right) / 2;
        int []leftSorted = mergeSort(arr,left,mid);
        int []rightSorted = mergeSort(arr,mid+1,right);
        return merge2Sorted(leftSorted,rightSorted);
    }


    public static int fib(int n,int []storage){
        if (n == 1 || n == 0)
            return n;
        if (storage[n] != 0){
            return storage[n];
        }
        int sp1 = fib(n - 2,storage);
        int sp2 = fib(n - 1,storage);

        int ans = sp1 + sp2;
        storage[n] = ans;
        return ans;
    }


    public static void main(String[] args) {
        int n = 6;
        int []storage = new int[n+1];
        int result = fib(n,storage);
        System.out.println(result);
    }

}
