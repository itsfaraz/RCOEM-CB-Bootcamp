package advance.day7;

public class NKnight {
    public static void main(String[] args) {
        int n = 4;
        nKnight(new boolean[n][n],n,0,0);
    }

    public static void nKnight(boolean [][]chessBoard,int target,int kPSF,int row){

        if (kPSF == target){
            display(chessBoard);
            System.out.println();
            return;
        }

        for (int col = 0; col < chessBoard[0].length; col++){
            if (isItSafeToPlacedKnight(row,col,chessBoard)){ // Position is safe to place queen
                chessBoard[row][col] = true;
                nKnight(chessBoard,target,kPSF+1,row+1);
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

    public static boolean isItSafeToPlacedKnight(int row,int col,boolean [][]chessBoard){

        int []rows = {1, 2, 2, 1,   -1, -2, -2, -1};
        int []cols = {2, 1, -1, -2, -2, -1, 1,  2};
        for (int idx = 0; idx < rows.length; idx++){
            if ((row + rows[idx]) >= 0 && (row - rows[idx]) < chessBoard.length){
                System.out.println(row+" "+col);
                if (col + cols[idx] >= 0 && col - cols[idx] < chessBoard[0].length){
                    System.out.println(row+" "+col);
                        if (chessBoard[row - rows[idx]][col - cols[idx]]){
                            System.out.println("OK");
                            return false;
                        }
                }
            }
        }
        return true;
    }

}
