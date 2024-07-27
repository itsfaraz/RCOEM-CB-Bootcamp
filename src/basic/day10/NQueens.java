package basic.day10;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        boolean [][]chessBoard = new boolean[n][n];
        nQueens(chessBoard,n,0,0);
    }

    public static void nQueens(boolean [][]chessBoard,int totalQueen,int qPSF,int row){

        if (qPSF == totalQueen){
            displayNQueens(chessBoard);
            return;
        }

        for (int col = 0; col < chessBoard[0].length;col++){
            if (isItPlaceToSafeQueen(row,col,chessBoard) == true) {
                chessBoard[row][col] = true; // Do Work
                nQueens(chessBoard, totalQueen, qPSF+1, row+1);
                chessBoard[row][col] = false; // Undo Work
            }
        }
    }

    private static void displayNQueens(boolean[][] chessBoard) {
        for (int row =0; row < chessBoard.length; row++){
            for (int col =0; col < chessBoard[0].length; col++){
                if (chessBoard[row][col] == true){
                    System.out.print("Q\t");
                }else{
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }

    public static boolean isItPlaceToSafeQueen(int row,int col,boolean[][] chessBoard){

        // Vertical Top
        int lRow = row;
        int lCol = col;
        while (lRow >= 0){
            if (chessBoard[lRow][lCol] == true){
                return false; // NO
            }
            lRow--;
        }

        // Top Diagonal Right
        lRow = row;
        lCol = col;
        while (lRow >=0 && lCol < chessBoard[0].length){
            if (chessBoard[lRow][lCol] == true){
                return false; // No
            }
            lRow--;
            lCol++;
        }


        // Horizontal Right
        lRow = row;
        lCol = col;
        while (lCol < chessBoard[0].length){
            if (chessBoard[lRow][lCol] == true){
                return false; // No
            }
            lCol++;
        }

        // Bottom Diagonal Right
        lRow = row;
        lCol = col;
        while (lCol < chessBoard[0].length && lRow < chessBoard.length){
            if (chessBoard[lRow][lCol] == true){
                return false; // No
            }
            lCol++;
            lRow++;
        }

        // Vertical Down
        lRow = row;
        lCol = col;
        while (lRow < chessBoard.length){
            if (chessBoard[lRow][lCol] == true){
                return false; // No
            }
            lRow++;
        }

        // Bottom Diagonal Left
        lRow = row;
        lCol = col;
        while (lCol >= 0 && lRow < chessBoard.length){
            if (chessBoard[lRow][lCol] == true){
                return false; // No
            }
            lCol--;
            lRow++;
        }


        // Horizontal Left
        lRow = row;
        lCol = col;
        while (lCol >= 0){
            if (chessBoard[lRow][lCol] == true){
                return false; // No
            }
            lCol--;
        }

        // Top Diagonal Left
        lRow = row;
        lCol = col;
        while (lCol >= 0 && lRow >= 0){
            if (chessBoard[lRow][lCol] == true){
                return false; // No
            }
            lCol--;
            lRow--;
        }

        return true; // Yes
    }

}
