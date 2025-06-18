class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int temp=-1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            else{
                temp++;
                nums[temp]=nums[i];
            }
        }
        return temp+1;
    }
}