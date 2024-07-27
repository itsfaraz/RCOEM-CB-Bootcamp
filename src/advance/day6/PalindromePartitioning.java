package advance.day6;

public class PalindromePartitioning {

    public static void main(String[] args) {
        partioning("nitin","");
    }

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

    public static void partioning(String ques,String ans){

        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int idx = 0; idx < ques.length(); idx++){
            String newAnswer = ques.substring(0,idx+1);
            String newQuestion = ques.substring(idx+1,ques.length());
            if (isPalindrome(newAnswer)){
                partioning(newQuestion,ans+newAnswer+" ");
            }
        }

    }

}
