
import java.util.HashMap;


class fibore{
    public static int fibo(int n,HashMap<Integer,Integer> memo){
        if(n==0)
        return 0;
        else if(n==1)
        return 1;
        else if(memo.containsKey(n)){
            return memo.get(n);
        }
        else if(!memo.containsKey(n)){
            memo.put(n,fibo(n-1,memo)+fibo(n-2,memo));
        }
        return memo.get(n);
    }
    public static void main(String[] args) {
        int n=7;
        HashMap<Integer,Integer> memo=new HashMap<>();
        int res=fibo(n,memo);
        System.out.println(res);
    }

}