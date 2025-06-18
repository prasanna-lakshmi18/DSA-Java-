class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int temp=1;
        for(int i=0;i<n;i++)    {
            if(nums[temp]!=nums[i]){
                nums[temp]=nums[i];
                temp++;
            }
        }
        return temp;
    }
}