import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int n = 120;
//        System.out.println(fib(n,new int[n+1]));
//        System.out.println(fibOptimized(n));

//        int [] arr = { 3, 4, 1, 6, 2, 5, 7};
//        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));

//        int m = 4;
//        int n = 4;
//        System.out.println(uniquePaths(m, n,0,0));
//        int [][] storage = new int[m][n];
//        System.out.println(uniquePathsMemoiz(m,n,0,0,storage));
//        displayMatrix(storage);
//        System.out.println(uniquePathsBU(m,n));



//        int []coins = {2,3,5};
//        int target = 8;
//        int []storage = new int[target+1];
//        System.out.println(coinChange(coins,target,0));
//        System.out.println(MAX);
//        System.out.println(coinChangeStorage(coins,target,0,storage));
//        System.out.println(Arrays.toString(storage));
//        climb(3,2,"");

        String s1 = "bsbininm";
        String s2 = "jmjkbkjkv";
//        int [][]storage = new int[s1.length()][s2.length()];
//        for (int []arr : storage){
//            Arrays.fill(arr,-1);
//        }
//        System.out.println(lcs(s1,s2,0,0,storage));
//        displayMatrix(storage);

        lcsOptimized(s2,s1);
    }



    public static void lcsOptimized(String s1,String s2){
        int [][]storage = new int[s1.length()+1][s2.length()+1];
        for (int row = 1; row < storage.length; row++){
            for (int col = 1; col < storage[0].length; col++){
                int ans = 0;
                if (s1.charAt(row-1) == s2.charAt(col-1)){
                    ans = storage[row-1][col-1] + 1;
                }else{
                    ans = Math.max(storage[row][col-1],storage[row-1][col]);
                }
                storage[row][col] = ans;
            }
        }
        displayMatrix(storage);
    }
    public static int lcs(String s1,String s2,int i,int j,int[][] storage){

        if (i == s1.length() || j == s2.length())
            return 0;

        if (storage[i][j] != -1)
            return storage[i][j];

        int count = 0;
        if (s1.charAt(i) == s2.charAt(j)){
            count = lcs(s1,s2,i+1,j+1,storage) + 1;
        }else{
            int sp1 = lcs(s1,s2,i,j+1,storage);
            int sp2 = lcs(s1,s2,i+1,j,storage);
            count = Math.max(sp1,sp2);
        }
        storage[i][j] = count;
        return count;
    }

    public static void climb(int n,int k,String ans){
        if (n == 0){
            System.out.println(ans);
            return;
        }
        if (n < 0)
            return;
        for (int idx = 1; idx <= k; idx++){
            climb(n - idx,k,ans + idx +" ");
        }
    }

    public static void displayMatrix(int [][]mat){
        for (int []arr : mat){
            for (int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
    public static int fib(int no,int []cache){

        if (no == 0 || no == 1)
            return no;

        if (cache[no] != 0)
            return cache[no];

        int sp1 = fib(no-1,cache);
        int sp2 = fib(no-2,cache);
        int ans = sp1 + sp2;
        cache[no] = ans;
        return ans;
    }

    public static int fibOptimized(int no){

        int []cache = new int[no+1];
        cache[0] = 0;
        cache[1] = 1;

        for (int noIdx = 2; noIdx < cache.length; noIdx++){
            cache[noIdx] = cache[noIdx-2] + cache[noIdx-1];
        }
        return cache[no];
    }

    public static int[] mergeSort(int []arr,int left,int right){

        if (left >= right){
            return new int[]{arr[left]};
        }

        int mid = (left+right)/2;
        int []sp1 = mergeSort(arr,left,mid);
        int []sp2 = mergeSort(arr,mid+1,right);

        return merge2Sorted(sp1,sp2);
    }

    public static int[] merge2Sorted(int []arr1,int []arr2){

        int idx1 = 0;
        int idx2 = 0;
        int []result = new int[arr1.length + arr2.length];
        int resultIdx = 0;
        while (idx1 < arr1.length && idx2 < arr2.length){
            if (arr1[idx1] <= arr2[idx2]){
                result[resultIdx] = arr1[idx1];
                idx1++;
            }else{
                result[resultIdx] = arr2[idx2];
                idx2++;
            }
            resultIdx++;
        }

        while (idx1 < arr1.length){
            result[resultIdx] = arr1[idx1];
            idx1++;
            resultIdx++;
        }

        while (idx2 < arr2.length){
            result[resultIdx] = arr2[idx2];
            idx2++;
            resultIdx++;
        }
        return result;
    }

    public static int fibBU(int no){
        int []arr = new int[no+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int idx = 2; idx < arr.length; idx++){
            arr[idx] = arr[idx-1] + arr[idx-2];
        }
        return arr[no];
    }
    public static int uniquePaths(int m,int n,int row,int col){
        if (row == m || col == n)
            return 0;
        if (row == m-1 && col == n-1)
            return 1;
        int sp1 = uniquePaths(m, n, row, col+1); // Right
        int sp2 = uniquePaths(m, n,row+1,col); // Down
        return sp1 + sp2;
    }

    public static int uniquePathsMemoiz(int m,int n,int row,int col,int [][]storage){
        if (row == m || col == n)
            return 0;
        if (row == m-1 && col == n-1)
            return 1;

        if (storage[row][col] != 0)
            return storage[row][col];

        int sp1 = uniquePathsMemoiz(m, n, row, col+1,storage); // Right
        int sp2 = uniquePathsMemoiz(m, n,row+1,col,storage); // Down

        storage[row][col] = sp1 + sp2;
        return sp1 + sp2;
    }
    public static int uniquePathsBU(int m,int n){
        int [][]storage = new int[m][n];
        prefill(storage,m,n);
        for (int row = m-2; row >= 0; row--){
            for (int col = n-2; col >= 0; col--){
                int ans = storage[row][col+1] + storage[row+1][col];
                storage[row][col] = ans;
            }
        }
        return storage[0][0];
    }

    private static void prefill(int[][] storage, int m, int n) {
        // row
        for (int col = 0; col < n; col++){
            storage[m-1][col] = 1;
        }
        // col
        for (int row = 0; row < m; row++){
            storage[row][n-1] = 1;
        }
        storage[m-1][n-1] = 0;
    }

    public static int MAX = Integer.MAX_VALUE;
    private static int coinChange(int []coins,int target,int vidx){
        if (target == 0) {
            MAX = Math.min(coins[vidx],MAX);
            return 1;
        }

        if (target < 0){
            return 0;
        }
        int count = 0;
        for (int idx = vidx; idx < coins.length; idx++){
            int sp = coinChange(coins,target - coins[idx], idx);
            count += sp;
        }
        return count;
    }
    private static int coinChangeStorage(int []coins,int target,int vidx,int[] storage){
        if (target == 0) {
            MAX = Math.min(coins[vidx],MAX);
            return 1;
        }

        if (target < 0){
            return 0;
        }

        if (storage[target] != 0){
            return storage[target];
        }

        int count = 0;
        for (int idx = vidx; idx < coins.length; idx++){
            int sp = coinChangeStorage(coins,target - coins[idx], idx, storage);
            count += sp;
        }
        storage[target] = count;
        return count;
    }



}