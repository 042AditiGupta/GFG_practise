class Solution {
    public boolean isPossible(int []arr,int n,int k,int mid)
    {
        int studentCount=1;
        int pageSum=0;
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i]+pageSum<=mid)
        {
            pageSum+=arr[i];
        }
        else
        {
            studentCount++;
            if(studentCount>k || arr[i]>mid)
            {
                return false;
            }
            pageSum=arr[i];
        }
        }    
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length; //no. of books
        // k is no. of students
        int start=0;
        int end=0;
        if(k>n)return -1;
        for(int ele:arr)
        {
            end+=ele;
        }
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(isPossible(arr,n,k,mid))
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