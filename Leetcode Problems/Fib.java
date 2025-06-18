class Fib {

    public static int f(int n,HashMap<Integer,Integer> memo){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else if(memo.containsKey(n)){
            return memo.get(n);
        }
        else if(!memo.containsKey(n)){
            memo.put(n,f(n-1,memo)+f(n-2,memo));
        }
        return memo.get(n);
    }

    public int fib(int n) {
        HashMap<Integer,Integer> memo=new HashMap<>();
        int res=f(n,memo);
        return res;
    }
}