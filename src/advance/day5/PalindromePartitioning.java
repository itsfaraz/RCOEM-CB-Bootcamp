package advance.day5;

public class PalindromePartitioning {


    public static boolean isPalindrome(String input){
        int start = 0;
        int end = input.length()-1;
        while (start <= end){

            if(input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

}
