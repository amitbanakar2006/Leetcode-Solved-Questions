class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxi=0;
        int tot=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                maxi=maxi+accounts[i][j];
            }
            tot=Math.max(maxi,tot);
            maxi=0;
        }
        return tot;
    }
}