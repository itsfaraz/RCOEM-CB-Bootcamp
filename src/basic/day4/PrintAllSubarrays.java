package basic.day4;

public class PrintAllSubarrays {

    public static void main(String[] args) {

        int[] input = {10,20,30,40};
        printSubArraySum(input);

    }

    public static void printSubArrays(int []input){

        for (int start = 0; start < input.length; start++){
            for (int end = start; end < input.length; end++){
                for (int print = start; print <= end; print++){
                    System.out.print(input[print]+" ");
                }
                System.out.println();
            }
        }


    }

    public static void printSubArraySum(int []input){

        for (int start = 0; start < input.length; start++){
            for (int end = start; end < input.length; end++){
                int sum = 0;
                for (int print = start; print <= end; print++){
                   sum += input[print];
                }
                System.out.println(sum);
            }
        }


    }


}
