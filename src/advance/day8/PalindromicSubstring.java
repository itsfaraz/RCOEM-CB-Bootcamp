package advance.day8;

public class PalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(palindromicSubstring("nitin"));
    }
    public static int palindromicSubstring(String str){
        int odd = 0;
        for (int axis = 0; axis < str.length(); axis++){
            for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++){
                if (str.charAt(axis - orbit) == str.charAt(axis + orbit)){
                    odd++;
                }else{
                    break;
                }
            }
        }
        int even = 0;
        for (double axis = 0.5; axis < str.length(); axis++){
            for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++){
                if (str.charAt((int)(axis - orbit)) == str.charAt((int)(axis + orbit))){
                    even++;
                }else{
                    break;
                }
            }
        }

        return odd + even;
    }

}
