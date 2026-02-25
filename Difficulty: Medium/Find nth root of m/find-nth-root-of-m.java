class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low=0;
        int high=m;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(Math.pow(mid,n)==m)
            {
                return mid;
            }
            else if(Math.pow(mid,n)>m)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return -1;
    }
}