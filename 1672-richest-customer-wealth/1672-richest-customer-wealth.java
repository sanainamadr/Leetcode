class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;// no. of person 
        int col = accounts[0].length; // money that person hold 

        int maxSum = 0;
        for(int i=0; i<row; i++){
            int sum=0;
            for(int j=0; j<col; j++){
                sum += accounts[i][j];
            }
            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
    }
}