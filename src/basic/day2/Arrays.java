package basic.day2;

public class Arrays {

    public static void main(String[] args) {


        int []arr = {10,30,20,50};
        int key = 20;
        for (int idx = 0; idx < arr.length; idx++){
            if (arr[idx] == key) {
                System.out.println(idx);
                break;
            }
        }


    }

}
