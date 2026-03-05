class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> amit=new HashMap<>();
        int i=0;
        while(i<nums.length){
            int res=target-nums[i];

            if(amit.containsKey(res)){
                return new int[] {amit.get(res),i};

            }
            else{
                amit.put(nums[i],i);
                i++;
            }
        }
        return null;
    }
}