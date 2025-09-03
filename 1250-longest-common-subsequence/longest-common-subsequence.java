class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int row = text1.length();
        int col = text2.length();

        int dp[][] = new int[row+1][col+1];
        for(int i = 1 ; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
        return dp[row][col];
    }
}



//Brute force
// int count = 0;
//         char[] txt1 = text1.toCharArray();
//         char[] txt2 = text2.toCharArray();

//         for(int i = 0; i < txt1.length; i++){
//             for(int j = 0; j < txt2.length; j++){
//                 if(txt2[j] == txt1[i]){
//                     count++;
//                     break;
//                 }
//             }
//         }
//         return count;