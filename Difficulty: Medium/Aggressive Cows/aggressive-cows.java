class Solution {
    public boolean isPossible(int []stalls,int k,int mid)
    {
        int lastPos=stalls[0];
        int cowsCount=1;
        for(int i=0;i<stalls.length;i++)
        {
            if(stalls[i]-lastPos>=mid)
            {
                cowsCount++;
                if(cowsCount==k)
                {
                    return true;
                }
                lastPos=stalls[i];
            }
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int start=0;
        int end=0;
        int ans=-1;
        Arrays.sort(stalls);
        for(int i=0;i<stalls.length;i++)
        {
            if(stalls[i]>end)
            {
                end=stalls[i];
            }
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isPossible(stalls,k,mid))
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
        
    }
}