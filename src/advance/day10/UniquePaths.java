package advance.day10;

public class UniquePaths {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int [][]board = new int[n][m];
        int [][]cache = new int[n][m];
        int result = uniquePaths(m,n,0,0,cache);
        System.out.println(result);
        System.out.println();
        display(cache);
    }

    public static void display(int [][]matrix){
        for (int []arr : matrix){
            for (int ele : arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    public static int uniquePaths(int m,int n,int row,int col,int [][]cache){
        if (col == n || row == m){
            return 0;
        }
        if (row == m-1 && col == n-1){
            return 1;
        }
        if (cache[row][col] != 0){
            return cache[row][col];
        }
        int sp1 = uniquePaths(m,n,row,col+1,cache);
        int sp2 = uniquePaths(m,n,row+1,col,cache);
        int ans = sp1 + sp2;
        cache[row][col] = ans;
        return ans;
    }

    public static int uniquePathsOptimized(int m,int n){
        int [][]cache = new int[m+1][n+1];
        cache[m-1][n-1] = 1;
        for (int row = m-1; row >= 0; row--){
            for (int col = n-1; col >= 0; col--){
                if (row == m-1 && col == n-1){
                    cache[row][col] = 1;
                }else{
                    int sp1 = cache[row][col+1];
                    int sp2 = cache[row+1][col];
                    int ans = sp1 + sp2;
                    cache[row][col] = ans;
                }
            }
        }
        return cache[0][0];
    }

}
