package basic.day1;

public class BasicControlFlow {


    public static void main(String[] args) {
        int []arr = {10,20,30,40};
        int n = arr.length;
//        for (int idx = 0; idx < n; idx++){
//            System.out.println(arr[idx]);
//        }

        for (int element : arr){
            System.out.println(element);
        }

    }

}

