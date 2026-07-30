class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        //take + skip
        int n=arr.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        return maxsum(0,arr,dp);
        
    }
    public int maxsum(int i,int []arr,int[]dp)
    {
        int n=arr.length;
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=arr[i]+maxsum(i+2,arr,dp);
        int skip=maxsum(i+1,arr,dp);
        return dp[i]=Math.max(take,skip);
    }
}