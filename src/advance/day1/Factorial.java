package advance.day1;

public class Factorial {


    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int index = arr.length-1;
        printArrayReverse(arr,index);
    }



    public static void printArrayReverse(int []arr,int index){
        if (index < 0)
            return;
        System.out.println(arr[index]);
        printArrayReverse(arr,index-1);
    }

    public static void printArray(int []arr,int index){
        if (index == arr.length)
            return;
        System.out.println(arr[index]);
        printArray(arr,index+1);
    }



    public static int factorial(int n){
        if (n == 1)
            return 1;

        int smallerAnswer = factorial(n-1);

        return n*smallerAnswer;

    }


    public static void printIncrementGFG(int n){
        if (n > 0){
            printIncrementGFG(n-1);
            System.out.println(n);
        }
    }
    public static void printIncremental(int n,int count){
        if (count > n)
            return;
        System.out.println(count);
        printIncremental(n,count+1);
    }


}
