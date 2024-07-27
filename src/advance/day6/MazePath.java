package advance.day6;

public class MazePath {

    public static void main(String[] args) {

        int [][]maze = new int[3][3];

        mazePath(maze,0,0,"");

    }

    public static void mazePath(int [][]maze,int row,int col,String ans){

        if (col == maze[0].length || row == maze.length){
            return;
        }

        if (row == maze.length-1 && col == maze[0].length-1){
            System.out.println(ans);
            return;
        }
        mazePath(maze,row,col+1,ans+"R ");
        mazePath(maze,row+1,col,ans+"D ");
    }

}
