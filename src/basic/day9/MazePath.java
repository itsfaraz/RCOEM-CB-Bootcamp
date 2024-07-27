package basic.day9;

public class MazePath {

    public static void mazePath(int [][]board,int row,int col,String ans){

        if (row == board.length-1 && col == board[0].length-1){
            System.out.println(ans);
            return;
        }

        if (col >= board[0].length || row >= board.length){
            return;
        }

        mazePath(board,row,col+1,ans+"R "); // Right
        mazePath(board, row+1, col, ans+"D "); // Down

    }

}
