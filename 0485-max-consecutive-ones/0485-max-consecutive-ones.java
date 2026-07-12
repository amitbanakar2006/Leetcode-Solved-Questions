class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] a=new int[nums.length];
        int cou=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cou=0;
            }
            else{
                cou++;
                a[k]=cou;
                k++;
            }
        }
        Arrays.sort(a);
        return a[a.length-1];





    //     int m=1,j=1;
    //    for(int i=0;i<nums.length-1;i++){
    //     if(nums[i]==nums[i+1]){
    //         m++;
    //         j=Math.max(j,m);

            
    //     }
    //     else if(nums[i]==0){
    //         j=0;
    //     }
    //    }
    //    return j;
    }
}