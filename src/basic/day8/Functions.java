package basic.day8;

public class Functions {

    public static void main(String[] args) {
        permutation("abc","");
    }
    public void printDecrement(int no){
        if (no == 0) return;
        System.out.println(no);
        printDecrement(no-1);
    }


    public void printArray(int []arr,int vidx){
        if (vidx == arr.length) return;
        System.out.println(arr[vidx]);
        printArray(arr,vidx+1);
    }


    public static void permutation(String ques,String ans){
        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int idx = 0; idx < ques.length(); idx++){
            String newAns = ques.substring(idx,idx+1);
            String newQues = ques.substring(0,idx) + ques.substring(idx+1,ques.length());
            permutation(newQues,ans+newAns+" ");
        }
    }

}
