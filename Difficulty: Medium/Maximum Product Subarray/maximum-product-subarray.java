class Solution {
    int maxProduct(int[] arr) {
        // code here
        int prefix=1;
        int suffix=1;
        int n=arr.length;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            maxProduct=Math.max(suffix,Math.max(prefix,maxProduct));
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            
        }
        return maxProduct;
    }
}