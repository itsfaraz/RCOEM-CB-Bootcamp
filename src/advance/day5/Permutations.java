package advance.day5;

public class Permutations {

    public static void permute(String ques,String ans){

        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int idx = 0; idx < ques.length(); idx++){
            String result = ques.substring(idx,idx+1); // a
            String remainingQuestion = ques.substring(0,idx) + ques.substring(idx+1,ques.length()); // bc
            permute(remainingQuestion,result);
        }
    }

}
