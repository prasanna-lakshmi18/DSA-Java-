class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> Dup=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(Dup.containsKey(nums[i]) && (i-Dup.get(nums[i]))<=k){
                return true;
            }
            Dup.put(nums[i],i);
            System.out.println(Dup.get(nums[i])-i);
        }
        return false;
    }
}