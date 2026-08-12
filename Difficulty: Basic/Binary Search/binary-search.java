class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==k)return true;
            if(arr[mid]<k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
    }
}