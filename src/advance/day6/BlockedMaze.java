package advance.day6;

public class BlockedMaze {

    public static void blockedMaze(int [][]maze,boolean [][]visited,int row,int col,String ans){
        if (col == maze[0].length || row == maze.length || row < 0 || col < 0){
            return;
        }
        if (maze[row][col] == 1 || visited[row][col])
            return;

        if (row == maze.length-1 && col == maze[0].length-1){
            System.out.println(ans);
            return;
        }
        visited[row][col] = true;
        blockedMaze(maze,visited,row+1,col,ans+"D ");
        blockedMaze(maze,visited,row-1,col,ans+"T ");
        blockedMaze(maze,visited,row,col+1,ans+"R ");
        blockedMaze(maze,visited,row,col-1,ans+"L ");
        visited[row][col] = false;
    }

}
