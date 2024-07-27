package advance.day10;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        int result = lcs("abcde","ace");
        System.out.println(result);
    }
    public static int lcs(String str1,String str2){
        if (str1.length() == 0 || str2.length() == 0)
            return 0;
        int sum = 0;
        if (str1.charAt(0) == str2.charAt(0)){
            sum = lcs(str1.substring(1),str2.substring(1)) + 1;
        }else{
            int sp1 = lcs(str1, str2.substring(1));
            int sp2 = lcs(str1.substring(1), str2);
            sum = Math.max(sp1,sp2);
        }
        return sum;
    }

}
