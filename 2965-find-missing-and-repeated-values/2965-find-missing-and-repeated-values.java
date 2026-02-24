class Solution {
    HashSet<Integer> an=new HashSet<>();
    HashSet<Integer> an2=new HashSet<>();
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        
        int a=0;
        int min=grid[0][0];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                min=Math.min(min,grid[i][j]);
                if(an.contains(grid[i][j])){
                   a=(grid[i][j]);
                }
                an.add(grid[i][j]);
            }
        }
        int b=0;
        if(min>1){
                b=min-1;
                return new int[] {a,b};
            }
        for(int i=0;i<grid.length*grid.length;i++){
            
            if(an.contains(min)){
                min=min+1;
            }
            else{
                b=min;
            }
        }


        return new int[] {a,b};
    }
}