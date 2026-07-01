class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        //lower bound = high=mid-1
        int low=0;
        int high=arr.length-1;
        int result=arr.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                result=mid;
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return result;
    }
}
