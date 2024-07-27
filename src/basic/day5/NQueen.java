package basic.day5;

public class NQueen {

    public static void main(String[] args) {
//        nQueen(4);
        nKnight(4);
    }

    public static void nKnight(int n){
        nKnight(new boolean[n][n],n,0,0);
    }

    private static void nKnight(boolean[][] board, int totalKnights, int kPSF, int row) {

        if (kPSF == totalKnights){
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board[0].length; col++){
            if (isItSafeToPlaceKnight(row,col,board)){
                board[row][col] = true;
                nKnight(board,totalKnights,kPSF+1,row+1);
                board[row][col] = false;
            }
        }

    }

    public static boolean isItSafeToPlaceKnight(int row,int col,boolean [][]board){
        int []rows = {1, 2, 2, 1,   -1, -2, -2, -1};
        int []cols = {2, 1, -1, -2, -2, -1, 1,  2};
        for (int idx = 0; idx < rows.length; idx++){
            if (row - rows[idx] >= 0 && col - cols[idx] >= 0) {
                if (row - rows[idx] < board.length && col - cols[idx] < board[0].length){
                    if (board[row-rows[idx]][col-cols[idx]]){
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public static void nQueen(int n){
        nQueenLogic(new boolean[n][n],n,0,0);
    }

    private static void nQueenLogic(boolean [][]board,int totalQueens,int qPSF, int row){
        if (qPSF == totalQueens){
            display(board);
            System.out.println();
            return;
        }


        for (int col = 0; col < board[0].length; col++){
            if (isItSafeToPlace(board,row,col)){
                board[row][col] = true;
                nQueenLogic(board,totalQueens,qPSF+1,row+1);
                board[row][col] = false;
            }

        }
    }

    private static boolean isItSafeToPlace(boolean[][] board, int row, int col) {
        int localRow = row;
        int localCol = col;

        // Check Vertical Top
        while (localRow-- > 0){
            if (board[localRow][localCol]) return false;
        }

        localRow = row;
        localCol = col;
        // Check Vertical Diagonal Right
        while (localRow-- > 0 && localCol++ < board[0].length-1){
            if (board[localRow][localCol]) return false;
        }

        localRow = row;
        localCol = col;
        // Check horizontal right
        while (localCol++ < board[0].length-1){
            if (board[localRow][localCol]) return false;
        }

        // Check bottom Diagonal right
        localRow = row;
        localCol = col;
        while (localRow++ < board.length-1 && localCol++ < board[0].length-1){
            if (board[localRow][localCol]) return false;
        }

        localRow = row;
        localCol = col;
        // Check Vertical Bottom
        while (localRow++ < board.length-1){
            if (board[localRow][localCol]) return false;
        }

        localRow = row;
        localCol = col;
        // Check bottom diagonal left
        while (localRow++ < board.length-1 && localCol-- > 0){
            if (board[localRow][localCol]) return false;
        }

        localRow = row;
        localCol = col;
        // Check horizontal left
        while (localCol-- > 0){
            if (board[localRow][localCol]) return false;
        }


        localRow = row;
        localCol = col;
        // Check Vertical left diagonal
        while (localRow-- > 0 && localCol-- > 0){
            if (board[localRow][localCol]) return false;
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (int row = 0; row < board.length; row++){
            for (int col = 0; col < board[0].length; col++){
                if (board[row][col]){
                    System.out.print("K ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

}
