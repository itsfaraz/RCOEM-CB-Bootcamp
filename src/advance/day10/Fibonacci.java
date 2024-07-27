package advance.day10;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String[] args) {
        int no = 6;
        int []cache = new int[no+1];
//        fib(no,cache);
//        System.out.println(Arrays.toString(cache));
        fib(no);
    }
    public static int fib(int no,int []cache){
        if (no == 0 || no == 1)
            return no;
        if (cache[no] != 0){
            return cache[no];
        }
        int sp1 = fib(no - 2,cache);
        int sp2 = fib(no -1,cache);
        int ans = sp1 + sp2;
        cache[no] = ans;
        return ans;
    }

    public static int fib(int no){
        int []cache = new int[no+1];
        cache[0] = 0;
        cache[1] = 1;
        for (int idx = 2; idx < cache.length; idx++){
            cache[idx] = cache[idx-2] + cache[idx-1];
        }
        for (int ele : cache){
            System.out.print(ele+" ");
        }
        return cache[no];
    }

}
