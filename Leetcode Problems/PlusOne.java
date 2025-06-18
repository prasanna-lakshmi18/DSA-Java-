class PlusOne {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        if(digits[n-1]<9){
            digits[n-1]+=1;
            return digits;
        }
        else{
            int carry=1;
            for(int i=n-1;i>=0;i--) {
                digits[i]+=1;
                if (digits[i]==10){
                    digits[i]=0;
                    carry=1;
                }
                else{
                    carry=0;
                    break;
                }
            }
            if(carry==1){
                int[] arr=new int[n+1];
                arr[0]=1;
                for(int i=1;i<=n;i++){
                    arr[i]=digits[i-1];
                }
                return arr;
            }
        }
        return digits;
    }
}