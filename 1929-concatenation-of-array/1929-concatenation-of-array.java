class Solution {
    public int[] getConcatenation(int[] nums) {
        int k=0;
        int j=0;
        int[] a=new int[nums.length*2];
        for(int i=0;i<=((nums.length-1)*2)+1;i++){
           a[k]=nums[j];
            k++;
            j++;
            if(i==nums.length-1){
                j=0;
            }
        }
        return a;
    }
}