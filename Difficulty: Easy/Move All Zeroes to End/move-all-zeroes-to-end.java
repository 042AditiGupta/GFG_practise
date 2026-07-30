class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int nonzeros=0;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[index++]=arr[i];
                nonzeros++;
            }
        }
        for(int i=nonzeros;i<arr.length;i++)
        {
            arr[i]=0;
        }
    }
}