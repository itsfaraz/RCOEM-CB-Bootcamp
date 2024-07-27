package basic.day9;

public class RulerScale {

    public static void main(String[] args) {
        rulerScale(3,2);
    }

    public static void rulerScale(int size, int tickLength){
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++){
                System.out.print("- ");
            }
            System.out.println();
            pattern(tickLength);
        }
        for (int col = 0; col < size; col++){
            System.out.print("- ");
        }
    }

    public static void pattern(int tickLength){
        if (tickLength == 0)
            return;
        pattern(tickLength-1);
        for (int tick = 1; tick <= tickLength; tick++){
            System.out.print("- ");
        }
        System.out.println();
        pattern(tickLength-1);
    }

}
