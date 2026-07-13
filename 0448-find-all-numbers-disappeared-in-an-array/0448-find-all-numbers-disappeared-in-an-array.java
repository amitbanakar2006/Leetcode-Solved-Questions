class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> a=new HashSet<>();      //hash set because it take o(1) for checking contains instead of o(n)
         ArrayList<Integer> aa=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
      
        for(int i=1;i<=nums.length;i++){
            if(!a.contains(i)){
            aa.add(i); 
            }
        }
        
        return aa;
        
    }
}