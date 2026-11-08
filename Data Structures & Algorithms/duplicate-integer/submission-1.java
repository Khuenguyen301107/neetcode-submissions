class Solution {
    public boolean hasDuplicate(int[] nums) {
        int N = nums.length;
        for(int i=0; i<N; i++){
            for(int j = i+1; j<N; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}