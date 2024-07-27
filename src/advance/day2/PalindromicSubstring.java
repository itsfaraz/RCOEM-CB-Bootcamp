package advance.day2;

public class PalindromicSubstring {

    public static void main(String[] args) {
//        System.out.println(subStrings("nitin"));
        System.out.println(countPalindromicSubString("nitin"));
    }

    public static int subStrings(String str){
        int count = 0;
        for (int idx = 0; idx < str.length(); idx++){
            for (int jdx = idx; jdx < str.length(); jdx++){
                String smallerString = str.substring(idx,jdx+1);
                if (isPalidrome(smallerString)){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalidrome(String str){
        int start = 0;
        int end = str.length()-1;
        while (start <= end){
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static int countPalindromicSubString(String str){
        int odd = 0;
        for (int axis = 0; axis < str.length(); axis++){
            for (int orbit = 0; (axis - orbit) >= 0 && (axis + orbit) <= str.length()-1; orbit++){
                if (str.charAt(axis - orbit) != str.charAt(axis + orbit)){
                    break;
                }
                odd++;

            }
        }

        int even = 0;
        for (double axis = 0.5; axis < str.length(); axis++){
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit <= str.length()-1; orbit++){
                if (str.charAt((int)(axis - orbit)) != str.charAt((int)(axis + orbit))){
                    break;
                }
                even++;
            }
        }
        return odd + even;
    }

}
