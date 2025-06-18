class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> Dup=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(Dup.containsKey(nums[i])){
                return true;
            }
            Dup.put(nums[i],1);
        }
        return false;
    }
}