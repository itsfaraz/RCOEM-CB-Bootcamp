package basic.day6;

public class ReverseWavePrint {

    public static void main(String[] args) {
        int [][]arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90},
        };
        printWave(arr);
    }

    public static void printWave(int [][]arr){
        for(int col = 0; col < arr[0].length; col++){
            if (col%2 == 0){
                for (int row = arr.length-1; row >= 0; row--){
                    System.out.print(arr[row][col]+" ");
                }
            }else{
                for (int row = 0; row < arr.length; row++){
                    System.out.print(arr[row][col]+" ");
                }
            }
        }
    }
}
