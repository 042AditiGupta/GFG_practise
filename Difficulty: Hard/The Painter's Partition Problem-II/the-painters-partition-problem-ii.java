class Solution {
    public boolean isPossible(int []arr,int k,int mid)
    {
        int TimeSum=0;
        int painter=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+TimeSum<=mid)
            {
                TimeSum+=arr[i];
            }
            else
            {
                painter++;
                if(arr[i]>mid || painter>k)
                {
                    return false;
                }
                 TimeSum=arr[i];
            }
            //for new worker
           
            
        }
        return true;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int start=0;
        int end=0;
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            end+=arr[i];
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isPossible(arr,k,mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }
}
