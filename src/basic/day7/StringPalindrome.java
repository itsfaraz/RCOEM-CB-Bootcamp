package basic.day7;

public class StringPalindrome {


    public static void main(String[] args) {
//        subString("nitin");
        int count = palindromicSubString("nitin");
        System.out.println(count);
    }

    public static void subString(String input){
        for (int start = 0; start < input.length(); start++){
            for (int end = start; end < input.length(); end++){
                String ans = input.substring(start,end+1);
                if (isPalindrome(ans)){
                    System.out.println(ans);
                }
            }
        }

    }

    public static boolean isPalindrome(String input){
        int start = 0;
        int end = input.length()-1;

        while (start <= end){
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static int palindromicSubString(String input){

        int odd = 0;
        for (int axis = 0; axis < input.length(); axis++){
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < input.length();
                 orbit++){
                if (input.charAt(axis - orbit) == input.charAt(axis + orbit)){
                    odd++;
                }else{
                    break;
                }
            }
        }
        int even = 0;
        for (double axis = 0.5; axis < input.length(); axis++){
            for (double orbit = 0; axis - orbit >= 0 && axis + orbit < input.length();
                 orbit++){
                if (input.charAt((int)(axis - orbit)) == input.charAt((int)(axis + orbit))){
                    even++;
                }else{
                    break;
                }
            }
        }
        return odd+even;
    }

}
