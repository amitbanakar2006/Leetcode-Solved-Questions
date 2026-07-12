class Solution {
    public int findNumbers(int[] nums) {
        int tot=0;
        for(int i=0;i<nums.length;i++){
           if( check(nums[i])){
            tot++;
           }

        }
        return tot;
        
    }

    public static boolean check(int a){
        int c=0;
        
        while(a!=0){
            c++;
            a=a/10;


        }
        if(c%2==0){
            return true;
        }
        else{
            return false;
        }
       
    }
    
}