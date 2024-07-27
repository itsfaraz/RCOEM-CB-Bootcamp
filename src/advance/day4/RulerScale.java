package advance.day4;

public class RulerScale {

    public static void main(String[] args) {
        createBoundaries(4,3);
//        createInnerScale(3);
    }


    public static void createBoundaries(int size,int tickLength){
        for (int row =0; row < size; row++){
            for (int col =0; col < size; col++){
                System.out.print("- ");
            }
            System.out.println();
            createInnerScale(tickLength);
        }
        for (int col =0; col < size; col++){
            System.out.print("- ");
        }
        System.out.println();
    }


    public static void createInnerScale(int tickLength){
        if (tickLength == 0)
            return;
        createInnerScale(tickLength-1);
        for (int idx =0; idx < tickLength; idx++){
            System.out.print("- ");
        }
        System.out.println();
        createInnerScale(tickLength-1);
    }

}
