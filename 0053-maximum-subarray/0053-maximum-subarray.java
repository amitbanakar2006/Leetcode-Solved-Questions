class Solution {
    public int maxSubArray(int[] nums) {
        int curr_temp=nums[0]; //if nums having length==1
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            curr_temp=curr_temp+nums[i];
            curr_temp=Math.max(nums[i],curr_temp);
            res=Math.max(res,curr_temp);
        }
        return res;
        
    }
}