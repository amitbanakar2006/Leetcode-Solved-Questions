class Solution {
    public int[] buildArray(int[] nums) {
        // int l=0;
        int[] a=new int[nums.length];
     for(int i=0;i<nums.length;i++){
        a[i]=nums[nums[i]];
        // l++;
     }  
     return a;
    }
}