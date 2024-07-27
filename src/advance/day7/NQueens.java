package advance.day7;

public class NQueens {

    public static void main(String[] args) {
        int n = 4;
        nQueens(new boolean[n][n],n,0,0);
    }

    public static void nQueens(boolean [][]chessBoard,int target,int qPSF,int row){

        if (qPSF == target){
            display(chessBoard);
            System.out.println();
            return;
        }

        for (int col = 0; col < chessBoard[0].length; col++){
            if (isItSafeToPlacedQueen(row,col,chessBoard)){ // Position is safe to place queen
                chessBoard[row][col] = true;
                nQueens(chessBoard,target,qPSF+1,row+1);
                chessBoard[row][col] = false;
            }
        }

    }

    private static void display(boolean[][] chessBoard) {
        for (int row = 0; row < chessBoard.length; row++){
            for (int col = 0; col < chessBoard[0].length; col++){
                if (chessBoard[row][col]){
                    System.out.print("Q ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isItSafeToPlacedQueen(int row,int col,boolean [][]chessBoard){

        int localRow = row;
        int localCol = col;


        // vertical top
        while (localRow >= 0){
            if (chessBoard[localRow][localCol]){ // queen placed
                return false;
            }
            localRow--;
        }

        // upper diagonal right
        localRow = row;
        localCol = col;

        while (localCol < chessBoard[0].length && localRow >= 0){
            if (chessBoard[localRow][localCol]){
                return false;
            }
            localCol++;
            localRow--;
        }

        // horizontal right
        localRow = row;
        localCol = col;
        while (localCol < chessBoard[0].length){
            if (chessBoard[localRow][localCol]){
                return false;
            }
            localCol++;
        }


        // bottom diagonal right
        localRow = row;
        localCol = col;
        while (localCol < chessBoard[0].length && localRow < chessBoard.length){
            if (chessBoard[localRow][localCol]){
                return false;
            }
            localCol++;
            localRow++;
        }


        // vertical bottom
        localRow = row;
        localCol = col;
        while (localRow < chessBoard.length){
            if (chessBoard[localRow][localCol]){
                return false;
            }
            localRow++;
        }

        // bottom diagoncal left
        localRow = row;
        localCol = col;
        while (localRow < chessBoard.length && localCol >= 0){
            if (chessBoard[localRow][localCol] == true){
                return false;
            }
            localRow++;
            localCol--;
        }

        // horizontal left
        localRow = row;
        localCol = col;
        while (localCol >= 0){
            if (chessBoard[localRow][localCol] == true){
                return false;
            }
            localCol--;
        }

        // upper diagonal left
        localRow = row;
        localCol = col;
        while (localRow >= 0 && localCol >= 0){
            if (chessBoard[localRow][localCol] == true){
                return false;
            }
            localRow--;
            localCol--;
        }

        return true;
    }

}
