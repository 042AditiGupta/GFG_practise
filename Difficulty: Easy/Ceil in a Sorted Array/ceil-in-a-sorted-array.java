// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int low=0;
        int res=-1;
        int n=arr.length;
        int high=n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=x)
            {
                res=mid;
                high=mid-1;
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
