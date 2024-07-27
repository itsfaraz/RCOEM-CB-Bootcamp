package basic.day5;

public class ArrayZigZag {
    public static void main(String[] args) {

        int [][]arr = {
                {10,20,30,40},
                {50,60,70,80},
                {90,100,110,120}
        };

        for (int row = 0; row < arr.length; row++){
            if (row % 2 == 0){
                for (int col = 0; col < arr[0].length; col++){
                    System.out.print(arr[row][col]+" ");
                }
            }else{
                for (int col = arr[0].length-1; col >= 0 ; col--){
                    System.out.print(arr[row][col]+" ");
                }
            }

            System.out.println();
        }

    }
}
