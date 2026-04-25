class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;int j=1;
        while(j<n){
            if(nums[i]==nums[j]){
                return true;
                
            }
            i++;
                j++;
        }
        return false;
    }
}