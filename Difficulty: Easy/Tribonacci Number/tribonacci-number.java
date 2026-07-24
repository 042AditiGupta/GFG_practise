class Solution {
    public static int nthTribonacci(int n) {
        // code here
        //Brute force approach
        // if(n==0 || n==1 )return n;
        //  if(n==2)return 1;
        //  return nthTribonacci(n-1)+nthTribonacci(n-2)+nthTribonacci(n-3);
        
        // using memoization+tabulation
        int []dp=new int [n+1];
        return helper(n,dp);
        
    }
    public static int helper(int n,int []dp)
    {
        if(n==0 || n==1)return n;
        if(n==2)return 1;
        if(dp[n]!=0)return dp[n];
        return dp[n]=helper(n-1,dp)+helper(n-2,dp)+helper(n-3,dp);
    }
}
