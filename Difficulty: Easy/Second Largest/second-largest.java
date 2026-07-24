class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int secondmax=-1;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(arr[i],max);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondmax && arr[i]!=max)
            {
                secondmax=arr[i];
                
            }
        }
        return secondmax;
    }
}