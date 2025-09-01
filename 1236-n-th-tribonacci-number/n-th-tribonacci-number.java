class Solution {
    int dp[];
    public int tribonacci(int n) {
        dp = new int[n+1];
        if(n == 0){
            return 0;
        }else if( n == 1|| n == 2){
            return 1;
        }
        dp[1] = 1;
        dp[2] = 1;

        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-2] + dp[i-1] + dp[i-3];
        }
        return dp[n];
    }
}