class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> ami=new HashSet<>();
        // int a=0;
        for(int i=0;i<nums.length;i++){
            if(ami.contains(nums[i])){
                ami.remove(nums[i]);
            }
            else{
            ami.add(nums[i]);}
           
        }
         return ami.iterator().next();


        // Arrays.sort(nums);
        // int l=0;
        // for(int i=0;i<nums.length;i++){
        //     l^=nums[i];
        //     // }
        //     // else if(nums[i]!=nums[i+1]){
        //     //     l=nums[i];
        //     // }

        // }
        // return l;
        
    }
}