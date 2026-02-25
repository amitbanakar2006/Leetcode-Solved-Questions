class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set2.add(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }

        return set2.iterator().next();
        
    }
}