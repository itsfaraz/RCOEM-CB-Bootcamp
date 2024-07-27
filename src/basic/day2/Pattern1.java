package basic.day2;

public class Pattern1 {
    public static void main(String[] args) {

        int n = 5;
        int row = 0;
        int star = 1;
        int space = n-1;
        while (row < n){

            // print space
            for (int spaceIdx = 1; spaceIdx <= space; space++){
                System.out.print(" \t");
            }

            // print star
            for (int starIdx = 1; starIdx <= star; starIdx++){
                System.out.print("*\t");
            }
            System.out.println();
            row += 1;
            star += 1;
            space -= 1;
        }


    }

}
