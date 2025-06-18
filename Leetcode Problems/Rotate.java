class Rotate {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] arr=new int[k+1];
        for(int i=0;i<=k;i++){
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=k+1;i<n;i++){
            nums[j]=nums[i];
            j++;
        }
        int m=0;
        for(int i=j;i<n;i++){
            nums[i]=arr[m];
            m++;
        }
    }
}