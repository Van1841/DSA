class Solution {
    public static boolean find(String s1, String s2, String s3, int i, int j, int k,Boolean dp[][]){
        if(k>=s3.length()&&i>=s1.length()&&j>=s2.length()) return true;
        else if(k>=s3.length()) return false;
        if(dp[i][j]!=null) return dp[i][j];
        if(i<s1.length()&& j<s2.length()&&s1.charAt(i)==s2.charAt(j) && s1.charAt(i)==s3.charAt(k))
        return dp[i][j]=find(s1,s2,s3,i+1,j,k+1,dp) || find(s1,s2,s3,i,j+1,k+1,dp);

        else if(i<s1.length()&&s1.charAt(i)==s3.charAt(k))
        return dp[i][j]= find(s1,s2,s3,i+1,j,k+1,dp);
        else if(j<s2.length()&&s2.charAt(j)==s3.charAt(k))
        return dp[i][j]=find(s1,s2,s3,i,j+1,k+1,dp);
        else
        return dp[i][j]=false;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean dp[][]=new Boolean[s1.length()+1][s2.length()+1];
        return find(s1,s2,s3,0,0,0,dp);
    }
}