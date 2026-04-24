class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=-1;
        int second_max=-1;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]>max)
            {
                second_max=max;
                max=arr[i];
            }
            if(arr[i]!=max && arr[i]>second_max)
            {
                second_max=arr[i];
            }
        }
        return second_max;
    }
}