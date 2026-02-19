class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        //lower bound
        int n=arr.length;
        int low=0,high=n-1;
        int res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<=x)
            {
                res=mid;
                low=mid+1;
            }
            else if(arr[mid]>x)
            {
                high=mid-1;
            }
            else
            
            {
                low=mid+1;
            }
        }
        return res;
    }
}
