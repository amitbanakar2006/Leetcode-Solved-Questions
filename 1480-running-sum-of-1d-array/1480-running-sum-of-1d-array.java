class Solution {
    public int[] runningSum(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            k+=nums[i];
            nums[i]=k;
        }
        return nums;
        
    }
}