class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int l=1;
        int n=nums.length;
        int num2=0;
        for(int i=0;i<n;i++){
            int r=target-nums[i];
            for(int j=i+1;j<n;j++){
                if(r==nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}