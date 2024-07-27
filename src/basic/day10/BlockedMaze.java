package basic.day10;

public class BlockedMaze {

    public static void main(String[] args) {
        int [][]board = {
                {0,1,0,0},
                {0,0,0,0},
                {0,1,0,0},
                {0,1,1,0},
        };
        boolean [][]visited = new boolean[board.length][board[0].length];
        blockedMaze(board,0,0,"",visited);
    }


    public static void blockedMaze(int [][]board,int row,int col,String ans, boolean [][]visited){
        if (row == board.length-1 && col == board[0].length-1){
            System.out.println(ans);
            return;
        }
        if (col == board[0].length || row == board.length || col < 0 || row < 0){
            return;
        }
        if (board[row][col] == 1 || visited[row][col] == true) { // Blocked Cell
            return;
        }
        visited[row][col] = true; // Do Work
        blockedMaze(board,row-1,col,ans+"T ",visited); // Top
        blockedMaze(board,row,col+1,ans+"R ",visited); // Right
        blockedMaze(board,row+1,col,ans+"D ",visited); // Down
        blockedMaze(board,row,col-1,ans+"L ",visited); // Left
        visited[row][col] = false; // Undo Work
    }

}
