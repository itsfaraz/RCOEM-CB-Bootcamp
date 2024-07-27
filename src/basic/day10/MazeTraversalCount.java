package basic.day10;

public class MazeTraversalCount {

    public static void main(String[] args) {
        int n = 3;
        int [][] board = new int[n][n];

        int result = uniquePaths(board,0,0);
        System.out.println(result);
    }

    public static int uniquePaths(int [][]board,int row,int col){
        if (col == board[0].length || row == board.length)
            return 0;

        if (row == board.length-1 && col == board[0].length-1){
            return 1;
        }

        int sp1 = uniquePaths(board, row, col+1); // right
        int sp2 = uniquePaths(board, row+1, col); // down
        int ans = sp1 + sp2;
        return ans;
    }

}
